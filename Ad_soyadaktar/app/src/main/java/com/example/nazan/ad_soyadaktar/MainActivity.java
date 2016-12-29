package com.example.nazan.ad_soyadaktar;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button b=(Button) findViewById(R.id.button);
        final EditText e1=(EditText)findViewById(R.id.editText);
        final EditText e2=(EditText)findViewById(R.id.editText2);
        final EditText e3=(EditText)findViewById(R.id.editText3);
        e1.setTextColor(Color.GRAY);
        e2.setTextColor(Color.CYAN);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")||e3.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Aktarılacak verileri gir",Toast.LENGTH_LONG).show();

                }else{
                    Intent yeni=new Intent(MainActivity.this,Aktar.class);
                    yeni.putExtra("Ad",e1.getText().toString());
                    yeni.putExtra("Soyad",e2.getText().toString());
                    yeni.putExtra("Tc",e3.getText().toString());
                    startActivity(yeni);


                }

            }
        });

    }
}
