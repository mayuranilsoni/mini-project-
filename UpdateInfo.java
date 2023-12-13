package com.example.regimen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpdateInfo extends AppCompatActivity {

    Button bx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_info);
        Intent four = getIntent();
        bx = findViewById(R.id.button);
        bx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backToMain = new Intent(getApplicationContext(), MainActivity.class);
                String name = "backFromUploadNotice";
                backToMain.putExtra("name", name);
                startActivity(backToMain);
                finish();
            }
        });


    }



}
