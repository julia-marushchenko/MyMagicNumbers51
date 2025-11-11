/**
 * Java program to find numbers dividable by 3.
 */

package com.numbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating ArrayList to store 27 random integers
        List<Integer> list = new ArrayList<>();

        // Adding numbers to a list
        for (int index = 0; index < 27; index++) {

            // Filling random numbers to a list
            list.add(new Random().nextInt(270));

        }

        // Printing number and result
        Iterator it = list.iterator();

        // Iterating through the list
        while (it.hasNext()) {

            // Saving temporal number to a local variable
            int number = (int)it.next();

            // Checking if number is dividable by 3 and printing it with result
            if (number % 3 == 0) {

                // Printing to console the result
                System.out.println(number + " is dividable by 3.");

            } else {

                // Printing to console the result
                System.out.println(number + " is not dividable by 3.");

            }
        }
    }
}