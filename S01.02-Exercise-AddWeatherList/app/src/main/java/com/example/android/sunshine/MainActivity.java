/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView mWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        mWeather = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] fakeWeatherData = {
                "Senin - Berawan - 25°C / 20°C",
                "Selasa - Hujan - 20°C / 15°C",
                "Rabu - Cerah - 30°C / 20°C",
                "Kamis - Hujan Badai - 19°C / 9°C",
                "Jumat - Badai Salju - 10°C / 0°C",
                "Sabtu - Hujan - 20°C / 15°C",
                "Minggu - Mendung - 20°C / 15°C",

        };

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String fakeWeatherDay : fakeWeatherData) {
            mWeather.append(fakeWeatherDay + "\n\n\n");
        }
    }
}