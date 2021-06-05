package section2;

public class Thermostat {

    public void setTemperature(double temperature) throws TemperatureToLowException, TemperatureToHightException {

        setMachineTemperature(temperature);

        System.out.println("Setting temperature to " + temperature);
    }

    private void setMachineTemperature(double temperature) throws TemperatureToLowException, TemperatureToHightException {
        if (temperature < 0) {
            throw new TemperatureToLowException("Temperature below minimum threshold");
            // throw new RuntimeException("Temperature out of range");
        } else if (temperature > 35) {
            throw new TemperatureToHightException("Temperature above maximum threshold");
        } 
    }

}
