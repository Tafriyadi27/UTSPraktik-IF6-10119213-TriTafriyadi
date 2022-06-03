package com.skullbreaker.utspraktik_if6_10119213_tritafriyadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Tanggal Pengerjaan   : 03/06/2022
// Nama                 : Tri Tafriyadi
// NIM                  : 10119213
// Kelas                : IF-6
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRegister = (Button) findViewById(R.id.btnregister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,IsianDataActivity.class);
                startActivity(intent);
            }
        });
    }
}