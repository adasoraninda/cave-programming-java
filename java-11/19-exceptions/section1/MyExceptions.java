package section1;

import java.util.Scanner;

class MyExceptions {

    public static void main(String[] args){
        System.out.println(getNumber());
    }

    // Checked exceptions
    private static void usingThrows() throws InterruptedException {
        System.out.println("One");
        Thread.sleep(2000);
        System.out.println("Two");
    }

    // Unchecked exceptions
    private static void inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int value = 0;

        System.out.print("Enter a number > ");
        String line = scanner.nextLine();

        try {
            value = Integer.parseInt(line);
            System.out.println("You entered: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }

        scanner.close();
    }

    private static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        int value = 0;

        while(true){
            System.out.print("Enter a number > ");
            String line = scanner.nextLine();

            try {
                value = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }

        scanner.close();
        return value;
    }

}