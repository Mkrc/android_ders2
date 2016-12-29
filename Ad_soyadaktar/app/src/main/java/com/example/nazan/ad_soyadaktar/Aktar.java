package com.example.nazan.ad_soyadaktar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by Nazan on 13.12.2016.
 */

public class Aktar extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktar);

        final EditText e1=(EditText)findViewById(R.id.editText4);
        final EditText e2=(EditText)findViewById(R.id.editText5);
        final EditText e3=(EditText)findViewById(R.id.editText6);
        e1.setEnabled(false);
        e2.setEnabled(false);
        e3.setEnabled(false);

        e1.setText(getIntent().getExtras().getString("Ad"));
        e2.setText(getIntent().getExtras().getString("Soyad"));
        e3.setText(getIntent().getExtras().getString("Tc"));

    }
}
