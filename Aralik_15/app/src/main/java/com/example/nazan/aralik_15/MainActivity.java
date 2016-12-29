package com.example.nazan.aralik_15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int sayac=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView i=(ImageView)findViewById(R.id.imageView);
        final ImageView i1=(ImageView)findViewById(R.id.imageView2);
        final EditText ed=(EditText)findViewById(R.id.editText);

        i1.setVisibility(View.INVISIBLE);
        ed.setEnabled(false);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sayac++;
                if(sayac%2!=0){
		//i1.setImageResource(R.drawable.a);
                    i1.setVisibility(View.VISIBLE);
                    ed.setEnabled(true);

                }

                else{
		//i1.setImageResource(R.drawable.b);
                    i1.setVisibility(View.INVISIBLE);
                    ed.setEnabled(false);

                }


            }
        });
    }
}
