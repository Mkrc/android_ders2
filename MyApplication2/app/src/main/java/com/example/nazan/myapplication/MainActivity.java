package com.example.nazan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
int sayac=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button b=(Button)findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // int a=Integer.parseInt(e.getText().toString());
              //  sayac+=a;
                Intent i=new Intent(MainActivity.this,Main2Activity.class);

                i.putExtra("a",sayac);
                startActivity(i);
            }
        });
    }
}
