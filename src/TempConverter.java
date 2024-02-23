/*
Alex Habbart
0855541
2/23/24
CSC 512
Lab 3
 */

// This program will read input of temperature in either Fahrenheit or Celsius, then
// convert that temperature into the other unit.

import java.util.Scanner;



public class TempConverter{

    public static void main(String[] args) {

        // Intro message
        System.out.println("Welcome to \"WCUPA\" Weather Channel");
        System.out.println("Temperature Conversion Program \n");

        // Scanner object declaration
        Scanner scanner = new Scanner(System.in);

        System.out.print("\t[Q1] Enter a temperature in degrees (for example, 29.6): ");

        // This will read in the temperature, without units
        float temp = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("\t[Q2] Enter \'F\' (or \'f\') for Fahrenheit " +
                            "or \'C\' (or \'c\') for Celsius: ");

        // This will allow the user to tell which unit they intend to have their
        // entered temperature labelled as
        String tempTypeString = scanner.nextLine();

        System.out.println();

        // Since there's no nextChar function, we read the temperature unit as a string
        // then take the first char from that single-letter string
        char tempType = Character.toLowerCase(tempTypeString.charAt(0));

        // declaring Conversion class object
        Conversion conversion = new Conversion();

        // declaring the variables for the target temperature in the opposite unit
        float tempToC, tempToF;

        // the conversion object contains the functions which convert the temp
        // and output the results
        switch (tempType){
            case 'c':
                conversion.displayResult(temp, conversion.convertCToF(temp), tempType);
                break;
            case 'f':
                conversion.displayResult(temp, conversion.convertFToC(temp), tempType);
                break;
            default:
                // This will end the program if a unit besides C or F is entered
                System.out.println("\n \tUnknown units -");
                System.out.println("\tCannot do calculation -");
                System.out.println("\tPlease enter either 'F' for Fahrenheit or " +
                                   "'C' for Celsius. \n");
        }

        System.out.println("Program ended.");
    }
}