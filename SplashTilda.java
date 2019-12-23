package com.botaniculus.multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashTilda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_tilda);

        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep(3000);
                } catch (Exception e){

                }
                finally {
                    Intent intent = new Intent(SplashTilda.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        };
        thread.start();
    }
}
