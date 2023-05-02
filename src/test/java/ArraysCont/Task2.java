package ArraysCont;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a list of unique elements taken from the user sort and print

Example
enter 10 integers: 1 8 9 2 6 6 1 3 5 5
your unique sorted elements: [1,2,3,5,6,8,9]

enter 10 integers: 1 1 1 1 1 1 1 1 1 2
your unique sorted elements: [1,2]


Enter 5 String: Kraft Kraft Tech Tech Kraft
your unique sorted elements: [Kraft, Tech]
         */

        /*
        0 1 1 2 3 5 8 13 21
         */

        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter 10 integers : ");


        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int temp = input.nextInt();

            if (!integers.contains(temp)) {
                integers.add(temp);
            }
        }
        Collections.sort(integers);
        System.out.println(integers);
    }
}
