package com.shahalam3041.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] countryNames;
    int[] flags = {R.drawable.afganistanpng, R.drawable.america, R.drawable.bangladesh,R.drawable.england,R.drawable.india,R.drawable.indoneshia,R.drawable.pakistan,R.drawable.thailand,R.drawable.iran};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);
        countryNames = getResources().getStringArray(R.array.country_name);

        CustomAdapter adapter = new CustomAdapter(this, countryNames, flags);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedCountry = countryNames[position];
                Toast.makeText(getApplicationContext(), clickedCountry, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
