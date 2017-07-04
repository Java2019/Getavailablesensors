package com.samples.hardware.getsensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class GetSensorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_sensors);

        TextView text = (TextView)findViewById(R.id.text);

        SensorManager manager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> sensorList = manager.getSensorList(Sensor.TYPE_ALL);
        text.append("Available sensors:");
        for (Sensor sensor:sensorList){
            text.append("\n" + sensor.getName());
        }
    }
}
