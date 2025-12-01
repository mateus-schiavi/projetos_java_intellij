package telemetria;

public class SensorData {

    private double temperature;
    private double speed;
    private int rpm;

    public SensorData(double temperature, double speed, int rpm) {
        this.temperature = temperature;
        this.speed = speed;
        this.rpm = rpm;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getSpeed() {
        return speed;
    }

    public int getRpm() {
        return rpm;
    }

    @Override
    public String toString() {
        return "SensorData {" +
                "temperature=" + temperature +
                ", speed=" + speed +
                ", rpm=" + rpm +
                '}';
    }
}
