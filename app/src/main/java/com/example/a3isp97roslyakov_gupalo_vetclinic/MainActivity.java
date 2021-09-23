package com.example.a3isp97roslyakov_gupalo_vetclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
ImageView imageview;
Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview = findViewById(R.id.paw1);
        animation = AnimationUtils.loadAnimation(this,R.anim.paw1);
        imageview.startAnimation(animation);
        imageview = findViewById(R.id.paw2);
        animation = AnimationUtils.loadAnimation(this,R.anim.paw2);
        imageview.startAnimation(animation);
        imageview = findViewById(R.id.paw3);
        animation = AnimationUtils.loadAnimation(this,R.anim.paw3);
        imageview.startAnimation(animation);
        imageview = findViewById(R.id.paw4);
        animation = AnimationUtils.loadAnimation(this,R.anim.paw4);
        imageview.startAnimation(animation);

        Thread threadlogo = new Thread(){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(6);
                    Intent inentlogo = new Intent(MainActivity.this,LogoActivity.class);
                    startActivity(inentlogo);
                }
                catch (InterruptedException e){

                    e.printStackTrace();

                }
            }
        };
        threadlogo.start();
    }
}