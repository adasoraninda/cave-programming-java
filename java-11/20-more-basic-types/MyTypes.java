public class MyTypes {
    public static void main(String[] args) {
        System.out.println("Primitive Types");

        System.out.println();
        // boolean = 1 bit
        // char = 16 bit
        System.out.printf("char is %d bit and %d bytes; min: %c, max: %c\n", Character.SIZE, Character.SIZE / 8,
                Character.MIN_VALUE, Character.MAX_VALUE);

        System.out.println();
        // byte = 8 bit
        // short = 16 bit
        // integer = 32 bit
        // long = 64 bit
        System.out.printf("byte is %d bit and %d bytes; min: %d, max: %d\n", Byte.SIZE, Byte.SIZE / 8, Byte.MIN_VALUE,
                Byte.MAX_VALUE);
        System.out.printf("short is %d bit and %d bytes; min: %d, max: %d\n", Short.SIZE, Short.SIZE / 8,
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int is %d bit and %d bytes; min: %d, max: %d\n", Integer.SIZE, Integer.SIZE / 8,
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long is %d bit and %d bytes; min: %d, max: %d\n", Long.SIZE, Long.SIZE / 8, Long.MIN_VALUE,
                Long.MAX_VALUE);

        System.out.println();
        // float = 32 bit
        // double = 64 bit
        System.out.printf("float is %d bit and %d bytes; min: %,.2f, max: %,.2f\n", Float.SIZE, Float.SIZE / 8,
                Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("dobule is %d bit and %d bytes; min: %,.2f, max: %,.2f\n", Double.SIZE, Double.SIZE / 8,
                Double.MIN_VALUE, Double.MAX_VALUE);

        // Numeric literals
        int number = 1_000_000; // 1E6

        
    }
}
