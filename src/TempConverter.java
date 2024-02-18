/*
Alex Habbart
0855541
2/3/24
CSC 512
Lab 2
 */

// This program will 
import java.util.Scanner;

public class TempConverter{

    public static void main(String[] args) {

        System.out.println("Welcome to \"WCUPA\" Weather Channel");
        System.out.println("Temperature Conversion Program \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\t[Q1] Enter a temperature in degrees (for example, 29.6): ");

        float temp = scanner.nextFloat();

        System.out.print("\t[Q2] Enter \'F\' (or \'f\') for Fahrenheit " +
                            "or \'C\' (or \'c\') for Celsius: ");

        String tempTypeString = scanner.next();

        char tempType = tempTypeString.charAt(0);

        System.out.println();

        float tempToC, tempToF;

        switch (tempType){
            case 'C':
            case 'c':
                tempToF = (9*temp/5)+32;
                System.out.println("\t" + temp + " degrees Celsius = " +
                                   String.format("%.2f",tempToF) +
                                   " degrees Fahrenheit.\n");
                break;
            case 'F':
            case 'f':
                tempToC = ((float)5/9)*(temp-32);
                System.out.println("\t" + temp + " degrees Fahrenheit = " +
                                   String.format("%.2f",tempToC) +
                                   " degrees Celsius.\n");
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