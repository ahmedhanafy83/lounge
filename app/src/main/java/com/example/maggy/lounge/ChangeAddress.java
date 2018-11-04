package com.example.maggy.lounge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ChangeAddress extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_address);
        Spinner spinner =  findViewById(R.id.city_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.city_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:

                Spinner spinner1 =  findViewById(R.id.area_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
                ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                        R.array.empty_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
                adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
                spinner1.setAdapter(adapter1);
                break;
            case 1:
                Spinner spinner2 =  findViewById(R.id.area_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
                ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                        R.array.cairo_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
                adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
                spinner2.setAdapter(adapter2);
                break;

            // spinner1.setOnItemSelectedListener(this);

            case 2:
                Spinner spinner3 =  findViewById(R.id.area_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
                ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                        R.array.alex_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
                adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
                spinner3.setAdapter(adapter3);
                break;

            // spinner2.setOnItemSelectedListener(this);

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public void saveadress(View view) {

        Intent i = new Intent(this,Conferm.class);
        startActivity(i);
    }
}
