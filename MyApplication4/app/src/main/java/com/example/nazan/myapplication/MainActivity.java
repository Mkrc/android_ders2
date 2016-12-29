package com.example.nazan.myapplication;

import android.content.Intent;
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

        final EditText e=(EditText)findViewById(R.id.editText);
        final EditText e1=(EditText)findViewById(R.id.editText2);
        final Button b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e.getText().toString().equals("Ali") && e1.getText().toString().equals("123")){

                    Intent i=new Intent(MainActivity.this,Yeni.class);
                    i.putExtra("Ad",e.getText().toString());
                    startActivity(i);


                }else {

                    Toast.makeText(getApplicationContext(),"Hata",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
