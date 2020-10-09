package com.example.framelayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView daylyForecastListView = findViewById(R.id.lv_dayli_forecast);

        String data[] = {
                "2020-10-1 晴 26-28°",
                "2020-10-2 晴 26-28°",
                "2020-10-3 晴 26-28°",
                "2020-10-4 晴 26-28°",
                "2020-10-5 晴 26-28°",
                "2020-10-6 晴 26-28°"

        };

        ArrayAdapter<String> daylyForecastAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        daylyForecastListView.setAdapter(daylyForecastAdapter);
    }
}