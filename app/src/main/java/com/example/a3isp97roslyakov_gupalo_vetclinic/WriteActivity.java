package com.example.a3isp97roslyakov_gupalo_vetclinic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.jar.Attributes;

public class WriteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
    }

    public void btn_write(View view) {
        EditText name = findViewById(R.id.Name);
        EditText petname = findViewById(R.id.PetName);
        EditText date = findViewById(R.id.DateReg);

        String name2 = name.getText().toString();
        String petname2 = petname.getText().toString();
        String date2 = date.getText().toString();
        Intent ini = new Intent(WriteActivity.this,ReadActivity.class);
        ini.putExtra("Name",name2);
        ini.putExtra("Pet_Name",petname2);
        ini.putExtra("Date",date2);
        startActivity(ini);
    }

    public void button_exit(View view) {
        Intent inent = new Intent(WriteActivity.this,LogoActivity.class);
        startActivity(inent);
    }
}
