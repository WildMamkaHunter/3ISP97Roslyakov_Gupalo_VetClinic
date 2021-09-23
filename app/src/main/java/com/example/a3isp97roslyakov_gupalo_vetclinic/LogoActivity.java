package com.example.a3isp97roslyakov_gupalo_vetclinic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LogoActivity extends AppCompatActivity {




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
    }

    public void btn_logo(View view) {
        Intent intent = new Intent(LogoActivity.this, WriteActivity.class);
        startActivity(intent);
    }
}
