package com.example.nazan.sayi_toplam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Topla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topla);


        final Button b=(Button) findViewById(R.id.button2);
        final EditText ad=(EditText) findViewById(R.id.editText5);
        final EditText soyad=(EditText) findViewById(R.id.editText6);
        final TextView t=(TextView) findViewById(R.id.textView8);
        final CheckBox cb1=(CheckBox) findViewById(R.id.checkBox);
        final RadioButton r1=(RadioButton) findViewById(R.id.radioButton);
        final RadioButton r2=(RadioButton) findViewById(R.id.radioButton2);
        final Spinner s=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter adt=ArrayAdapter.createFromResource(this,R.array.Sehir,android.R.layout.simple_spinner_item);
        adt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adt);



      cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
              if(cb1.isChecked ()) {
                  r1.setVisibility(View.VISIBLE);
                  r2.setVisibility(View.VISIBLE);
              }
              else{

                  r1.setVisibility(View.INVISIBLE);
                  r2.setVisibility(View.INVISIBLE);
              }
          }
      });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String cinsiyet="Cinsiyet Girilmedi";
                if(cb1.isChecked()){
                if( r1.isChecked() ){
                    cinsiyet="Kadın";
                }
                else if(r2.isChecked()){
                    cinsiyet="Erkek";
                }}else
                    cinsiyet="Cinsiyet Girilmedi";
                t.setText(ad.getText()+" \n"+soyad.getText()+"\n"+cinsiyet+"\n"+s.getSelectedItem().toString());

            }
        });

    }
}
