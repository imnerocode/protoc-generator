# PowerShell script to generate files from proto using namely/protoc-all

$Current_Path = Get-Location
$Proto_Files = "${Current_Path}\proto"
$Proto_Files_Docker = $Proto_Files -replace "\\", "/"
$Generated_Files = "${Proto_Files}\generated"

# Ensure output directory exists
if (-Not (Test-Path -Path $Generated_Files)) {
    New-Item -ItemType Directory -Path $Generated_Files
}

# Accepted languages and their mapping to namely/protoc-all
$Language_Options = @{
    "golang" = "go";
    "ruby" = "ruby";
    "java" = "java";
    "python" = "python";
    "csharp" = "csharp";
    "cpp" = "cpp";
    "node" = "node";
}

# Prompt for language
$Language = Read-Host "Please enter the language you want to generate the code for: $($Language_Options.Keys -join ', ')"

# Map user input to the actual language supported by namely/protoc-all
if ($Language_Options.ContainsKey($Language)) {
    $Mapped_Language = $Language_Options[$Language]
    Write-Host "Generating code for $Language"

    if (-Not (Test-Path -Path $Proto_Files)) {
        Write-Host "Proto files not found"
        exit
    }

    # Loop through proto files and find the ones matching the selected language
    $MatchingFiles = Get-ChildItem -Path $Proto_Files -Filter "*.proto" | Where-Object {
        $Content = Get-Content -Path $_.FullName
        if ($Language -eq "csharp") {
            # Special case for C#: Check for csharp_namespace
            $Content -match "option\s+csharp_namespace\s*="
        } elseif ($Language -eq "golang" -or $Language -eq "go") {
            # Special case for Go: Check for go_package
            $Content -match "option\s+go_package\s*="
        } else {
            # General case: Check for {language}_package
            $OptionKey = $Mapped_Language + "_package"
            $Content -match "option\s+$OptionKey\s*="
        }
    }

    if (-Not $MatchingFiles) {
        Write-Host "No .proto file found with the appropriate option for $Language."
        exit
    }

    # Generate code for each matching file
    foreach ($Proto_File in $MatchingFiles) {
        Write-Host "Processing file: $($Proto_File.Name)"
        
        # Special case for C#
        if ($Language -eq "csharp") {
            docker run --rm -v "${Proto_Files_Docker}:/defs" -v "${Generated_Files}:/out" namely/protoc-all -i /defs -f $Proto_File.Name -o /out -l csharp --with-grpc --csharp_opt=file_extension=.cs
        } else {
            docker run --rm -v "${Proto_Files_Docker}:/defs" -v "${Generated_Files}:/out" namely/protoc-all -i /defs -f $Proto_File.Name -o /out -l $Mapped_Language --with-grpc
        }
    }

    Write-Host "Code generated successfully in $Generated_Files"
} else {
    Write-Host "Language not supported. Please specify one of: $($Language_Options.Keys -join ', ')"
    exit
}
