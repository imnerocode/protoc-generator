# Protobuf Generator Script

This repository contains a PowerShell script designed to automate the generation of Protobuf files for multiple programming languages using Docker.

## Features
- Currently supports generating gRPC and Protobuf code for the following languages:
    - Go (Golang)
    - Ruby
    - Java
    - C# (Csharp)
- Utilizes the `namely/protoc-all` Docker image for consistency across environments.
- Automatically detects `.proto` files and organizes the generated code.

## Prerequisites
- Docker installed and running.
- PowerShell available on your system.

## Usage
1. Clone this repository:
    ```bash
    git clone github.com/imnerocode/protoc-generator
    ```
2. Place your `.proto` files inside a `proto/` directory at the root level.
3. Run the script:
    ```powershell
    .\generate_proto.ps1
    ```
4. Follow the on-screen prompts to select the desired language for code generation.

## Notes
- Supported languages currently require specific package options in the `.proto` files:
    - **Go**: `option go_package`
    - **Ruby**: `option ruby_package`
    - **Java**: `option java_package`
    - **C#**: `option csharp_namespace`
- Generated files will be stored in the `proto/generated/` directory.
- Ensure your `.proto` files are properly defined and include all necessary imports.

## Planned Features
- Expand support to Python, C++, PHP, Node.js, and TypeScript in future updates.
- Improve validation for `.proto` files and package configurations.

## Contributing
Feel free to open issues or submit pull requests to improve the script. Contributions to support additional languages are especially welcome!
