package com.example.nazan.final_1_ideal_kilo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b=(Button)findViewById(R.id.button);
        final EditText e=(EditText)findViewById(R.id.editText);
        final EditText e2=(EditText)findViewById(R.id.editText2);
        final EditText e3=(EditText)findViewById(R.id.editText3);
        final Spinner s=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter adt=ArrayAdapter.createFromResource(this,R.array.Cinsiyet,android.R.layout.simple_spinner_item);
        adt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adt);
        final TextView t=(TextView)findViewById(R.id.textView2);
        final TextView t2=(TextView)findViewById(R.id.textView3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double sonuc;
                if(s.getSelectedItem().toString().equals("Kadın")){
                        sonuc=(Double.parseDouble(e.getText().toString())-100+Double.parseDouble(e2.getText().toString())/10)*0.8;
                        t.setText(String.valueOf(sonuc));
               }else
                {
                    sonuc=(Double.parseDouble(e.getText().toString())-100+Double.parseDouble(e2.getText().toString())/10)*0.9;
                    t.setText(String.valueOf(sonuc));

                }
                if(sonuc<Double.parseDouble(e3.getText().toString())){
                    t2.setText("Şişmansın");
                }
                else if(sonuc==Double.parseDouble(e3.getText().toString()))
                    t2.setText("İdeal");
                else
                    t2.setText("Zayıf");
            }
        });
    }
}
