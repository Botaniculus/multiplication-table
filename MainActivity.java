package com.botaniculus.multiplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    TextView zadaniTxt;
    String display;
    LinearLayout linearLayout;
    TextView scoreTxt;
    int kint1;
    int kint2;
    boolean correct;
    boolean incorrect;
    int score;
    int sprTlacitko;

    final Kostka b1=new Kostka(100);
    final Kostka tlacitko=new Kostka(4);
    final Kostka k1 = new Kostka(10);
    final Kostka k2=new Kostka(10);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        zadaniTxt=(TextView)findViewById(R.id.zadaniTxt);
        linearLayout=(LinearLayout)findViewById(R.id.linearLayout);
        scoreTxt=(TextView)findViewById(R.id.scoreTxt);

        operace();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((button1.getText().toString()).equals(kint1*kint2+"")) {
                    correct=true;
                    incorrect=false;
                    operace();

                } else{
                    incorrect=true;
                    correct=false;
                    operace();

                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((button2.getText().toString()).equals(kint1*kint2+"")) {
                    correct=true;
                    incorrect=false;
                    operace();

                } else{
                    incorrect=true;
                    correct=false;
                    operace();

                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((button3.getText().toString()).equals(kint1*kint2+"")) {
                    correct=true;
                    incorrect=false;
                    operace();

                } else{
                    incorrect=true;
                    correct=false;
                    operace();

                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((button4.getText().toString()).equals(kint1*kint2+"")) {
                    correct=true;
                    incorrect=false;
                    operace();

                } else{
                    incorrect=true;
                    correct=false;
                    operace();

                }
            }
        });
    }
    public void novyDisplay(){
        zadaniTxt.setText(display);
        sprTlacitko=tlacitko.hod();
        if(sprTlacitko==1) {
            button1.setText(kint1 * kint2 + "");
            button2.setText(kint1*(kint2-1)+"");
            button3.setText((kint1-1)*kint2+"");
            button4.setText(kint1+kint2+"");
        }
        if(sprTlacitko==2) {
            button2.setText(kint1 * kint2 + "");
            button3.setText(kint1*(kint2-1)+"");
            button4.setText((kint1-1)*kint2+"");
            button1.setText(kint1+kint2+"");
        }
        if(sprTlacitko==3) {
            button3.setText(kint1 * kint2 + "");
            button4.setText(kint1*(kint2-1)+"");
            button1.setText((kint1-1)*kint2+"");
            button2.setText(kint1+kint2+"");
        }
        if(sprTlacitko==4) {
            button4.setText(kint1 * kint2 + "");
            button1.setText(kint1*(kint2-1)+"");
            button2.setText((kint1-1)*kint2+"");
            button3.setText(kint1+kint2+"");
        }
        if(sprTlacitko==0) {
            Toast.makeText(getApplicationContext(), "sprTlacitko==0", Toast.LENGTH_SHORT).show();
        }
        //else
            //Toast.makeText(getApplicationContext(), "Error novyDisplay()", Toast.LENGTH_SHORT).show();
    }

    public void kintovani(){
        kint1=k1.hod();
        kint2=k2.hod();
    }

    public void operace(){
        kintovani();
        display = (kint1+"x"+kint2);
        novyDisplay();
        if(correct){
            score++;
        }
        if(incorrect){
            score=score-2;
        }
        scoreTxt.setText(score+"");
        if(score<0){
            scoreTxt.setTextColor(getResources().getColor(R.color.red));
        }
        else{
            scoreTxt.setTextColor(getResources().getColor(R.color.blueText));
        }
    }


}
