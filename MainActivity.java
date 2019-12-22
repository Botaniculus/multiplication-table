package com.botaniculus.multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    TextView zadaniTxt;
    String display;
    int kint1;
    int kint2;
    boolean correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        zadaniTxt=(TextView)findViewById(R.id.zadaniTxt);

        operace();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((button4.getText().toString()).equals(kint1*kint2)) {
                    operace();
                    correct=true;
                } else{
                    Toast.makeText(getApplicationContext(), (button1.getText().toString()), Toast.LENGTH_SHORT).show();
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((button2.getText().toString()).equals(kint1*kint2)) {
                    correct=true;
                    operace();
                } else{
                    Toast.makeText(getApplicationContext(), (button1.getText().toString()), Toast.LENGTH_SHORT).show();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((button3.getText().toString()).equals(kint1*kint2)) {
                    correct=true;
                    operace();
                } else{
                    Toast.makeText(getApplicationContext(), (button1.getText().toString()), Toast.LENGTH_SHORT).show();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((button4.getText().toString()).equals(kint1*kint2)) {
                    correct=true;
                    operace();
                } else{
                    Toast.makeText(getApplicationContext(), (button1.getText().toString()), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void novyDisplay(){
        zadaniTxt.setText(display);
    }

    public void kintovani(){
        Kostka k1 = new Kostka(4);
        Kostka k2=new Kostka(4);
        kint1=k1.hod();
        kint2=k2.hod();
    }

    public void operace(){
        kintovani();
        display = (kint1+"x"+kint2);
        novyDisplay();
    }


}
