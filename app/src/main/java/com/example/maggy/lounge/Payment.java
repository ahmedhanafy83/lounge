package com.example.maggy.lounge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;


import java.util.ArrayList;
import java.util.List;

public class Payment extends AppCompatActivity {

    RadioButton visa , cash;
    EditText visaNum , visaPassword ;
    List<Hero> heroList;
    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paymrnt);

        cash = findViewById(R.id.cash);
        visa = findViewById(R.id.visa);
        visaNum = findViewById(R.id.visaNum);
        visaPassword = findViewById(R.id.visaPassword);

        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                visaNum.setVisibility(View.INVISIBLE);
                visaPassword.setVisibility(View.INVISIBLE);


            }
        });

        visa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visaNum.setVisibility(View.VISIBLE);
                visaPassword.setVisibility(View.VISIBLE);

            }
        });



        heroList = new ArrayList<>();
        listView = findViewById(R.id.listView);


        heroList.add(new Hero(R.drawable.image9, "new dress", "249.95"));
        heroList.add(new Hero(R.drawable.image13, "new dress", "124.95"));
        heroList.add(new Hero(R.drawable.image9, "new dress", "659.95"));
        heroList.add(new Hero(R.drawable.image13, "new dress", "564.95"));
        heroList.add(new Hero(R.drawable.image9, "new dress", "987.95"));
        heroList.add(new Hero(R.drawable.image13, "new dress", "323.95"));


        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);


        listView.setAdapter(adapter);
    }


    public void comblete(View view) {

            Intent c = new Intent(this, Conferm.class);
            startActivity(c);
        
    }
}