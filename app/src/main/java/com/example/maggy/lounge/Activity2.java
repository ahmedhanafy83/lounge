package com.example.maggy.lounge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

ImageView iv ,ivLike, ivComment , ivShare;
TextView tv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity2 );
        iv = findViewById( R.id.iv );
        tv = findViewById( R.id.tv );
        ivLike = findViewById( R.id.iv_like );
        ivComment = findViewById( R.id.iv_comment );
        ivShare = findViewById( R.id.iv_share );

        ivLike.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivLike.setImageResource( R.drawable.liked );
            }
        } );

    }

}
