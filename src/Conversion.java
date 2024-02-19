public class Conversion {

    public float convertFToC(float temp) {
        return ((float) 5 / 9) * (temp - 32);
    }

    public float convertCToF(float temp) {
        return (9 * temp / 5) + 32;
    }

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



