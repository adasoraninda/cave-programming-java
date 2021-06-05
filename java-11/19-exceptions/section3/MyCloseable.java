package section3;

public class MyCloseable {
    public static void main(String[] args) {
        // Database db = null;

        // try {
        // db = new Database(null);
        // db.getData();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }finally{
        // try {
        // db.close();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // }

        // Try with resources
        try(Database db = new Database("nl")){
            db.getData();
        } catch (Exception e) {
            System.out.println("Catching exception ...");
            System.out.println(e.getMessage());
        }
    }
}
