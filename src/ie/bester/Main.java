package ie.bester;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //CONSTANTS
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // DATE
        Date rightNow = new Date();
        System.out.println(rightNow);

        // DATA COLLECTION
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Enter your last name: ");
        String lastName = scanner.next();
        // System.out.println(firstName + lastName);

        //INPUT QUESTIONS

        System.out.print("Q1. How much did you borrow?: ");
        int Q1 = scanner.nextInt();

        System.out.print("Q2. What was the Annual % Interest Rate?: ");
        float Q2 = scanner.nextFloat();
        float monthlyInterest = Q2 / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Q3. Over how many years?: ");
        int Q3 = scanner.nextByte();




        //CALCULATIONS
        // double result = Q1 + Q2r + Q3n;
        int Q1p = Q1;
        double Q2r = Q2 / PERCENT / MONTHS_IN_YEAR;
        int Q3n = Q3 * MONTHS_IN_YEAR;
        double resultA = 1 + Q2r;
        double resultB = Math.pow(resultA, Q3n);
        double resultTop = Q2r * resultB;
        double resultBottom = resultB - 1;
        double resultC = resultTop / resultBottom;
        float resultD = (float) (Q1p * resultC);
        // System.out.println(resultC);

        //OUTPUT
        System.out.println(firstName + " " + lastName + " you borrowed €" + Q1 + " at " + Q2 + "% APR over " + Q3 + " years, giving you a monthly repayment of €" + resultD + " per month, you plank" );

        //THIS IS A TEST COMMENT
        //MADE ON GITHUB TO SEE WHAT HAPPENS
        //DID THIS APPEAR LOCALLY?
        // Uploaded at 00:00 on Fri 11 Dec.
        // Sat 12 Dec

    }
}

