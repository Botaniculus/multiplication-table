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
    }

    public void kintovani(){
        Kostka k1 = new Kostka(4);
        Kostka k2=new Kostka(1);
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



    }

}
