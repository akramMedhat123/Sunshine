package com.example.akram.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private ArrayAdapter<String> FCAdapter;

    int test=9;

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_main, container, false);

        String[] FCarray = {"Today - Sunny - 88/63", "Tomorrow - foggy - 70/40", "Weds - Cloudy - 72/63", "Thurs - Asteroids - 75/65",
                "Fri - Heavy Rain - 65/56", "Sat - HELP TRAPPED IN WEATHER STATION - 60/51", "Sun - sunny - 80/68"};
        List<String> WeekForCast = new ArrayList<String>(Arrays.asList(FCarray));


        FCAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                WeekForCast
        );

        ListView listView = (ListView) rootview.findViewById(R.id.ListView_forcast);
        listView.setAdapter(FCAdapter);
        return rootview;
    }
}