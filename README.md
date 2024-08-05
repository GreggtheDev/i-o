# File Merger and Common Integer Finder

## Overview

This Java program reads integers from two text files (`input1.txt` and `input2.txt`), merges their contents while maintaining the original order, and identifies common integers. The results are written to two output files: `merged.txt` (containing all integers from both files) and `common.txt` (containing integers present in both input files).

## Features

- Reads integers from two input files.
- Merges the contents of the input files while preserving the order.
- Identifies integers present in both input files.
- Writes the merged integers to `merged.txt`.
- Writes common integers to `common.txt`.
- Handles file-related and number format exceptions.

## Requirements

- Java 8 or higher

## Usage

1. **Prepare Input Files**:
   - Create two text files, `input1.txt` and `input2.txt`, each containing a list of integers (one integer per line).

2. **Compile the Program**:
   ```sh
   javac FileMerger.java
Run the Program:

sh
Copy code
java FileMerger
Output Files:

merged.txt: Contains all integers from both input files, maintaining the original order.
common.txt: Contains integers present in both input files.
Error Handling
The program handles the following exceptions:
FileNotFoundException: If an input file is not found.
IOException: If an I/O error occurs during file operations.
NumberFormatException: If a line in the input file does not contain a valid integer.
Example
Input Files
input1.txt

Copy code
1
3
5
7
9
input2.txt

Copy code
2
3
5
8
10
Output Files
merged.txt

Copy code
1
3
5
7
9
2
3
5
8
10
common.txt

Copy code
3
5
Notes
Ensure that the input files are in the same directory as the FileMerger.java file, or provide the full path to the input files in the code.
The program assumes that the input files contain one integer per line.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contributing
Contributions are welcome! Please feel free to submit a Pull Request or open an Issue for any improvements or bug fixes.

