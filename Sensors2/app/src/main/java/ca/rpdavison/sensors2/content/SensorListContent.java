package ca.rpdavison.sensors2.content;

import android.hardware.Sensor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class SensorListContent {

    public static List<SensorDetail> SENSORS = new ArrayList<SensorDetail>();

    public static Map<String, SensorDetail> SENSOR_MAP = new HashMap<String, SensorDetail>();

    public SensorListContent(List<Sensor> sensors) {
        if (SENSORS.isEmpty()) {
            initialize(sensors);
        }
    }

    private void initialize(List<Sensor> sensors) {
        System.out.println("* * * INITIALIZING SENSOR LIST * * * *");
        System.out.println(String.format("Found %s sensors", sensors.size()));
        int index = 0;
        for (Sensor sensor: sensors) {
            SensorDetail detail = new SensorDetail(++index, sensor);
            SENSOR_MAP.put("" + index, detail);
            SENSORS.add(detail);
        }
    }

    public class SensorDetail {
        private Sensor sensor;

        public final String id;
        public final String content;
        public final String details;

        public SensorDetail(int index, Sensor sensor) {
            this.sensor = sensor;
            this.id = index + "";
            this.content = sensor.getName();
            this.details = sensor.getVendor();
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
