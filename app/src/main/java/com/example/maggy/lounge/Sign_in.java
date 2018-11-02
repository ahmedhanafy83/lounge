package com.example.maggy.lounge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    public void go_create(View view) {
        Intent i = new Intent(Sign_in.this,sign_up.class);
        startActivity(i);
        finish();
    }
}
