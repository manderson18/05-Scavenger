package com.company;


import java.io.*;
import java.util.*;
import java.lang.*;


    public class ScavengerOne {

        private static int[] bestItems(int capacity, int[] available) throws IOException {
        // Read the file contents
            // Determine capacity after taking in to account ship weight
            // Go through each line and determine if adding the number is appropriate
            // If the number makes the count go over capacity, it is not added
            // Loop it
            // Stop loop if no number is added to the weight
            // Assume each item isn't finite and can be used multiple times


            //I'm gonna do this over the weekend anyway because I want to understand it
            Scanner input = new Scanner((new File("01.in")));

    System.out.println(input.nextLine());

            return new int[100];
            // YOUR CODE IN HERE
        }

        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);



            int numOfTestCases = sc.nextInt();

            for (int testCase=0; testCase < numOfTestCases; testCase++) {

                int capacity = sc.nextInt();

                int numItems = sc.nextInt();
                int[] items = new int[numItems];

                for (int i=0; i<numItems; i++) {
                    items[i] = sc.nextInt();
                }

                int[] result = bestItems(capacity, items);

                if (result.length == 0) {
                    System.out.println("Cannot fill to capacity, U WOT M8");
                } else {
                    Arrays.sort(result);
                    System.out.println("This run uses: " + Arrays.toString(result));
                }

            }

            sc.close();
        }
    }
