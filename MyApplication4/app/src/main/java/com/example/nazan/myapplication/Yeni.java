package com.example.nazan.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Nazan on 15.12.2016.
 */

public class Yeni extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yeni);




        final TextView t=(TextView)findViewById(R.id.textView2);

        t.setText("Hoşgeldin "+getIntent().getExtras().getString("Ad"));
    }

}
