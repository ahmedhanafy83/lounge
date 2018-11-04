package com.example.maggy.lounge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Conferm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conferm);
    }

    public void go_change(View view) {

        Intent e=new Intent(this,ChangeAddress.class);
        startActivity(e);
    }

    public void confirm(View view) {
        Toast.makeText(this,"The order confirmed",Toast.LENGTH_LONG).show();
        Intent v=new Intent(this,MainActivity.class);
        startActivity(v);
    }
}
