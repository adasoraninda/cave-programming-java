public class MyFactorial {

    public static void main(String[] args) {
        System.out.println(sum(2));
        System.out.println(factorialRecursive(3));
    }

    private static int factorialRegular1(int value) {
        int result = 1;

        for (int i = value; i > 0; --i) {
            result *= i;
        }

        return result;
    }

    private static int factorialRegular2(int value) {
        if (value <= 0) {
            return 1;
        }

        for (int i = value - 1; i > 1; --i) {
            value *= i;
        }

        return value;
    }

    private static int factorialRecursive(int value) {
        if (value == 0) {
            return 1;
        }

        return factorialRecursive(value - 1) * value;
    }

    private static int sum(int number){
        if(number == 0){
            return number;
        }

        return number + sum(number-1);
    }

}
