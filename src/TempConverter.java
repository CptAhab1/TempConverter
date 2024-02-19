/*
Alex Habbart
0855541
2/3/24
CSC 512
Lab 2
 */

// This program will read input of temperature in either Fahrenheit or Celsius, then convert
// that temperature into the other unit.

import java.util.Scanner;



public class TempConverter{

    public static void main(String[] args) {

        System.out.println("Welcome to \"WCUPA\" Weather Channel");
        System.out.println("Temperature Conversion Program \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\t[Q1] Enter a temperature in degrees (for example, 29.6): ");

        float temp = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("\t[Q2] Enter \'F\' (or \'f\') for Fahrenheit " +
                            "or \'C\' (or \'c\') for Celsius: ");

        String tempTypeString = scanner.nextLine();

        System.out.println();

        char tempType = Character.toLowerCase(tempTypeString.charAt(0));

        Conversion conversion = new Conversion();

        float tempToC, tempToF;

        switch (tempType){
            case 'c':
                conversion.displayResult(temp, conversion.convertCToF(temp), tempType);
                break;
            case 'f':
                conversion.displayResult(temp, conversion.convertFToC(temp), tempType);
                break;
            default:
                System.out.println("\n \tUnknown units -");
                System.out.println("\tCannot do calculation -");
                System.out.println("\tPlease enter either 'F' for Fahrenheit or " +
                                   "'C' for Celsius. \n");
        }

        System.out.println("Program ended.");
    }
}