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
