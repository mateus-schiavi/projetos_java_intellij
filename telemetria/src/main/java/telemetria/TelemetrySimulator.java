package telemetria;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class TelemetrySimulator {

    private final Random random = new Random();
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public void start() {
        executor.scheduleAtFixedRate(() -> {
            SensorData data = generateData();
            System.out.println(data);
        }, 0, 1, TimeUnit.SECONDS);
    }

    private SensorData generateData() {
        double temperature = 70 + random.nextGaussian() * 5;
        double speed = random.nextGaussian() * 320;
        int rpm = random.nextInt(16000);

        return new SensorData(
                Math.round(temperature * 10) / 10.0,
                Math.round(speed * 10) / 10.0,
                rpm
        );
    }
}
