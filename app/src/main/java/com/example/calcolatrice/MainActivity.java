package com.example.calcolatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String result = "";


        final EditText text = (EditText) findViewById(R.id.editText);

        Button but_1 =  (Button) findViewById(R.id.but_1);
        but_1.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"1");
            }
        });

        Button but_2 =  (Button) findViewById(R.id.but_2);
        Button but_3 =  (Button) findViewById(R.id.but_3);
        Button but_4 =  (Button) findViewById(R.id.but_4);
        Button but_5 =  (Button) findViewById(R.id.but_5);
        Button but_6 =  (Button) findViewById(R.id.but_6);
        Button but_7 =  (Button) findViewById(R.id.but_7);
        Button but_8 =  (Button) findViewById(R.id.but_8);
        Button but_9 =  (Button) findViewById(R.id.but_9);
        Button but_0 =  (Button) findViewById(R.id.but_0);

        Button but_p =  (Button) findViewById(R.id.but_p);
        Button but_eq =  (Button) findViewById(R.id.but_eq);


    }


}
