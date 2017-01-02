package com.example.nazan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final EditText e1=(EditText)findViewById(R.id.editText2);
        final Button b=(Button)findViewById(R.id.button2);
        final TextView t1=(TextView)findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=getIntent().getExtras().getInt("a");
                int t=Integer.parseInt(e1.getText().toString());
                int toplam=a+t;
               t1.setText(String.valueOf(toplam));
            }
        });

    }
}
