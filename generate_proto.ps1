# PowerShell script to generate files from proto using namely/protoc-all

$Current_Path = Get-Location
$Proto_Files = "${Current_Path}\proto"
$Proto_Files_Docker = $Proto_Files -replace "\\", "/"
$Generated_Files = "${Proto_Files}\generated"

# Ensure output directory exists
if (-Not (Test-Path -Path $Generated_Files)) {
    New-Item -ItemType Directory -Path $Generated_Files
}

# Accepted languages
$Languages = @("golang", "ruby", "java", "python", "csharp", "cpp", "php", "node", "typescript")
$Language_Abbreviations = @{
    "golang" = "go";
    "ruby" = "ruby";
    "java" = "java";
    "python" = "python";
    "csharp" = "csharp";
    "cpp" = "cpp";
    "php" = "php";
    "node" = "node";
    "typescript" = "typescript";
}

# Prompt for language
$Language = Read-Host "Please enter the language you want to generate the code for: $Languages"

if ($Languages -contains $Language) {
    Write-Host "Generating code for $Language"
    if (-Not (Test-Path -Path $Proto_Files)) {
        Write-Host "Proto files not found"
        exit
    }

    # Get the language abbreviation
    $Language_Abr = $Language_Abbreviations[$Language]

    # Run Docker command
    docker run --rm -v "${Proto_Files_Docker}:/defs" -v "${Generated_Files}:/out" namely/protoc-all -d /defs -o /out -l $Language_Abr --with-grpc

    Write-Host "Code generated successfully in $Generated_Files"

} else {
    Write-Host "Language not supported"
    exit
}
