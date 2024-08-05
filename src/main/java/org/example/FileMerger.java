package org.example;

import java.io.*;
import java.util.*;

public class FileMerger {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> commonSet = new HashSet<>();

        try {
            // Read integers from input1.txt
            list1 = readIntegersFromFile("input1.txt");
            // Read integers from input2.txt
            list2 = readIntegersFromFile("input2.txt");

            // Merge the lists while maintaining the original order
            List<Integer> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);

            // Write the merged list to merged.txt
            writeIntegersToFile(mergedList, "merged.txt");

            // Find common integers
            Set<Integer> set1 = new HashSet<>(list1);
            for (Integer num : list2) {
                if (set1.contains(num)) {
                    commonSet.add(num);
                }
            }

            // Write common integers to common.txt
            writeIntegersToFile(new ArrayList<>(commonSet), "common.txt");

        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException occurred: " + e.getMessage());
        }
    }

    /**
     * Reads integers from a file and returns them as a list.
     *
     * @param fileName the name of the file to read from
     * @return a list of integers read from the file
     * @throws IOException if an I/O error occurs
     * @throws NumberFormatException if a line does not contain a valid integer
     */
    private static List<Integer> readIntegersFromFile(String fileName) throws IOException {
        List<Integer> list = new ArrayList<>();
        // Use try-with-resources to ensure the reader is closed after use
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line.trim()));
            }
        }
        return list;
    }

    /**
     * Writes a list of integers to a file.
     *
     * @param list the list of integers to write
     * @param fileName the name of the file to write to
     * @throws IOException if an I/O error occurs
     */
    private static void writeIntegersToFile(List<Integer> list, String fileName) throws IOException {
        // Use try-with-resources to ensure the writer is closed after use
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer num : list) {
                bw.write(num.toString());
                bw.newLine();
            }
        }
    }
}
