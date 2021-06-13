class MyVariable {
    public static void main(String[] args) {
        // Convert Fahrenheit to Celcius
        double fahrenheit = 32;

       printTemperature(fahrenheit, convertToCelcius(fahrenheit));
    }

    private static double convertToCelcius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    private static void printTemperature(double fahrenheit, double celcius){
        System.out.printf("Fahrenheit: %.2f", fahrenheit);
        System.out.println();
        System.out.printf("Celcius: %.2f", celcius);
    }

}