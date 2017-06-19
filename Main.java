package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//This program checks to see if a number is an Armstrong number
        Scanner scanner = new Scanner(System.in); //sets up a new scanner
        System.out.println("Please enter a number:"); //Prompts user to enter a number



        int userNum = scanner.nextInt();                   //assigns the users number to variable userNum
        int num ;                                          //assigns num as an integer variable
        int sumOfCubes = 0;                               //initialized sumOfCubes to zero
        int rem ;                                        //assigns rem to as an integer variable


        num = userNum;                                  //assigns num to userNum to be used in the while loop expression
        while (num != 0 ) {                             //evaluates num to see if it is equal to 0 and proceeds through loop if not
            rem = num % 10;                             // gets the remainder of the users num
            num = num / 10;                             // isolates the first two numbers from the users num
            sumOfCubes = sumOfCubes + rem * rem * rem;  //sums the cube of each number from the users original number
        }

        if (num == sumOfCubes)                          // tests if the users original number is equal to the sum of the cubes of each individual number from the original number

            System.out.print("True");                   //prints true if orginal number and sum is equal

            else

            System.out.print("False");                  //prints false if original number and sum is not equal

        }
    }






