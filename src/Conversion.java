// This class contains several functions for converting temperatures
// and displaying the results of the conversion.
public class Conversion {

    // Converts from Fahrenheit to Celsius
    public float convertFToC(float temp) {
        return ((float) 5 / 9) * (temp - 32);
    }

    // Converts from Celsius to Fahrenheit
    public float convertCToF(float temp) {
        return (9 * temp / 5) + 32;
    }

    // Displays the results from whichever conversion is processed,
    // including a formatting instruction to round to 2 decimals
    public void displayResult(float temp, float tempConverted, char tempType) {

        switch (tempType) {
            case 'f':
                System.out.println("\t" + temp + " degrees Fahrenheit = " +
                        String.format("%.2f", tempConverted) +
                        " degrees Celsius.\n");
                break;
            case 'c':
                System.out.println("\t" + temp + " degrees Celsius = " +
                        String.format("%.2f", tempConverted) +
                        " degrees Fahrenheit.\n");
                break;
        }
    }
}



