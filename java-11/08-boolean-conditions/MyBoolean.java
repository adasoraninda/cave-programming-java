public class MyBoolean {
    public static void main(String[] args) {
        
        boolean mightRain = false;
        boolean isRaining = true;
        boolean haveUmbrella = false;

        boolean takeUmbrella = false;

        /**
         * AND (&&) CONDITIONS
         */
        if(isRaining){
            if(haveUmbrella){
                takeUmbrella = true;
            }
        }

        if(isRaining && haveUmbrella){
            takeUmbrella = true;
        }

        takeUmbrella = isRaining && haveUmbrella;

        System.out.println(takeUmbrella);

        /**
         * OR (||) CONDITIONS
         */
        if(isRaining || mightRain){
            takeUmbrella = true;
        }

        takeUmbrella = isRaining || mightRain;

        System.out.println(takeUmbrella);

        /**
         * COMPLEX BOOLEAN
         */
        boolean rainCheck = isRaining || mightRain;

        if(rainCheck && haveUmbrella){
            System.out.println("Take umbrella!");
        }else{
            System.out.println("Don't take umbrella.");
        }
        
    }
}
