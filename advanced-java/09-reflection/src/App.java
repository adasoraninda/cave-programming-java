import java.util.Arrays;

public class User {
    protected int id;
}

public class Employee extends User {
    public int getId() {
        return id;
    }
}

public class App {
    public static void main(String[] args) {
        // Class<?> clazz = Class.forName("app.Employee");
        // User user = new Employee();
        // Class<? extends User> clazz = u.getClass();
        Class<Employee> clazz = Employee.class;

        // Listing Fields
        System.out.println(Arrays.asList(clazz.getFields()));
        System.out.println(Arrays.asList(clazz.getDeclaredFields()));

        // Listing Method
        System.out.println(Arrays.asList(clazz.getMethods()));
        System.out.println(Arrays.asList(clazz.getDeclaredMethods()));
    }
}
