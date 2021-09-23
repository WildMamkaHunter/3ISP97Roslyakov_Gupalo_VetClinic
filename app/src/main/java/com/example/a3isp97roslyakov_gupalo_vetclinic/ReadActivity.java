package com.example.a3isp97roslyakov_gupalo_vetclinic;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ReadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        TextView txtview = findViewById(R.id.textViewname);
        TextView txtview2 = findViewById(R.id.textView2);
        TextView txtview3 = findViewById(R.id.textView3);
//        TextView textView = new TextView(this);
//        textView.setTextSize(26);
//        textView.setPadding(16,16,16,16);

        Bundle arguments = getIntent().getExtras();

            String name = arguments.get("Name").toString();
            String petname = arguments.get("Pet_Name").toString();
            String date = arguments.get("Date").toString();
//            textView.setText("ФИО: "+name+"\nИмя питомца: "+petname+"\nДата записи: "+date);
            txtview.setText(name);
            txtview2.setText(petname);
            txtview3.setText(date);
    }
}
