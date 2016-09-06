package com.wolfe;

import java.util.Scanner;

public class Main {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Write your code between here...

        double DISTANCE_TOTAL = 26.2;
        double distance = 1.0;
        int weekNum = 1;
        double percentage = 0.10;



        while (distance <= DISTANCE_TOTAL) {

            distance = distance + distance * percentage;
            weekNum++;
              System.out.print("weeknumber: " + weekNum);
              System.out.println(String.format(" Distance run: %.2f", distance));

        }

        System.out.println("It will take " + weekNum + " weeks to reach your goal.");
        System.out.println(String.format("Distance run: %.2f",  distance));


        // ... and here.

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();
    }

}
