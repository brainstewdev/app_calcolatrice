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
        but_2.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"2");
            }
        });

        Button but_3 =  (Button) findViewById(R.id.but_3);
        but_3.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"3");
            }
        });

        Button but_4 =  (Button) findViewById(R.id.but_4);
        but_4.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"4");
            }
        });

        Button but_5 =  (Button) findViewById(R.id.but_5);
        but_5.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"5");
            }
        });

        Button but_6 =  (Button) findViewById(R.id.but_6);
        but_6.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"6");
            }
        });


        Button but_7 =  (Button) findViewById(R.id.but_7);
        but_7.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"7");
            }
        });

        Button but_8 =  (Button) findViewById(R.id.but_8);
        but_8.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"8");
            }
        });

        Button but_9 =  (Button) findViewById(R.id.but_9);
        but_9.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"9");
            }
        });

        Button but_0 =  (Button) findViewById(R.id.but_0);
        but_0.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"0");
            }
        });

        Button but_p =  (Button) findViewById(R.id.but_p);
        but_p.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                String text_place;
                text_place = text.getText().toString();
                text.setText(text_place+"+");
            }
        });

        Button but_eq =  (Button) findViewById(R.id.but_eq);
        but_eq.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                String risultato = "";
                String parte;



                parte = text.getText().toString();

                String parti[] =  parte.split("\\+");

                //int lungh = parti.length();
                int parti_num[] = new int[parti.length];
                int somma = 0;
                if(parti.length != 0) {


                    for (int x = 0; x < parti.length; x++) {
                        parti_num[x] = Integer.parseInt(parti[x]);

                        somma = somma + parti_num[x];
                    }
                    //text_place = text.getText().toString();
                    risultato = Integer.toString(somma);


                    text.setText(risultato);
                }
                else{
                    text.setText("0");
                }
            }
        });


    }


}
