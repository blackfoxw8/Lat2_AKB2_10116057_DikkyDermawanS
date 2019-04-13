package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * AKB2 10116057 Dikky Dermawan S
 * CHANGELOG
 * Aplikasi V0.1 13/04/2019 12.00
 * - Membuat Halaman Awal
 * - Membuat Halaman Register
 * - Membuat Halaman Almost There
 *
 * 
 */

public class MainActivity extends AppCompatActivity {
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegister();
            }
        });
    }

    public void openRegister(){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
}
