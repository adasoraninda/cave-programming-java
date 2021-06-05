package section2;

public class ThermostatMain {

    public static void main(String[] args) {
        Thermostat stat = new Thermostat();

        try {
            stat.setTemperature(170);
        } catch (TemperatureOutOfRangeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
}
