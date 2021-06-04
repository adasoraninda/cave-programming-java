public class MyStatic {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Rikachu");
        Cat cat2 = new Cat("Bulbasaurus");

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(Cat.FOOD);

        String catCount = String.format("Count of cats: %d\n", Cat.getCount());

        System.out.println(catCount);
    }

    public static class Cat {
        public final static String FOOD = "CAT_FOOD";
        private static int count = 0;
        static double averageHeight;

        private String name;
        private int id;
        
        /**
         * Static initialization Blocks
         */
        static {
            averageHeight = 215/7.0;
            System.out.println("Hello Cats");
        }

        public Cat(String name) {
            this.name = name;

            id = count;

            ++count;
        }

        public static int getCount() {
            return count;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return String.format("Cat id: %d, name: %s", id, name);
        }

    }
}
