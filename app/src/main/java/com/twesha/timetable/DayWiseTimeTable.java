package com.twesha.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DayWiseTimeTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_wise_time_table);
        Intent intent=getIntent();

        String msg1=intent.getStringExtra(MainActivity.MSG1);
        String msg2=intent.getStringExtra(MainActivity.MSG2);
        String msg3=intent.getStringExtra(MainActivity.MSG3);
        String msg4=intent.getStringExtra(MainActivity.MSG4);



        TextView textView1=findViewById(R.id.textView15);
        textView1.setText(msg1);
        TextView textView2=findViewById(R.id.textView11);
        textView2.setText(msg2);
        TextView textView3=findViewById(R.id.textView9);
        textView3.setText(msg3);
        TextView textView4=findViewById(R.id.textView14);
        textView4.setText(msg4);
    }

}