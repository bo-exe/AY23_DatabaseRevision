package com.myapplicationdev.databaserevision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnInsertRecord, btnRetrieveRecordstv, btnRetrieveRecordslv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInsertRecord = findViewById(R.id.btnInsertRecord);
        btnRetrieveRecordstv = findViewById(R.id.btnGetRecordtv);
        btnRetrieveRecordslv = findViewById(R.id.btnGetRecordlv);

        btnInsertRecord.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, InsertActivity.class);
                startActivity(i);
            }
        });

        btnRetrieveRecordstv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RetrieveActivityTextView.class);
                startActivity(i);
            }
        });

        btnRetrieveRecordslv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RetrieveActivityListView.class);
                startActivity(i);
            }
        });

    }
}