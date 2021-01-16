package com.twesha.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String MSG1="com.twesha.timetable.tt1";
    public static final String MSG2="com.twesha.timetable.tt2";
    public static final String MSG3="com.twesha.timetable.tt3";
    public static final String MSG4="com.twesha.timetable.tt4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  public void viewTimeTable(View view)
  {
      Intent intent=new Intent(this,DayWiseTimeTable.class);

      String msg1="";
      String msg2="";
      String msg3="";
      String msg4="";


      if(findViewById(R.id.imageButton15)==view)
      {
          msg1="-";
          intent.putExtra(MSG1,msg1);
          msg2="Computer Networks";
          intent.putExtra(MSG2,msg2);
          msg3="Systems Programming";
          intent.putExtra(MSG3,msg3);
          msg4="-";
          intent.putExtra(MSG4,msg4);
      }
      else if(findViewById(R.id.imageButton14)==view)
      {
          msg1="Object-Oriented Programming";
          intent.putExtra(MSG1,msg1);
          msg2="-";
          intent.putExtra(MSG2,msg2);
          msg3="Web Programming";
          intent.putExtra(MSG3,msg3);
          msg4="LAB:Systems Programming";
          intent.putExtra(MSG4,msg4);
      }
      else if(findViewById(R.id.imageButton13)==view)
      {
          msg1="Systems Programming";
          intent.putExtra(MSG1,msg1);
          msg2="-";
          intent.putExtra(MSG2,msg2);
          msg3="-";
          intent.putExtra(MSG3,msg3);
          msg4="-";
          intent.putExtra(MSG4,msg4);
      }
      else if(findViewById(R.id.imageButton12)==view)
      {
          msg1="Object-Oriented Programming";
          intent.putExtra(MSG1,msg1);
          msg2="Software Engineering";
          intent.putExtra(MSG2,msg2);
          msg3="Computer Networks";
          intent.putExtra(MSG3,msg3);
          msg4="-";
          intent.putExtra(MSG4,msg4);
      }
      else if(findViewById(R.id.imageButton11)==view)
      {
          msg1="Web Programming";
          intent.putExtra(MSG1,msg1);
          msg2="Software Engineering";
          intent.putExtra(MSG2,msg2);
          msg3="-";
          intent.putExtra(MSG3,msg3);
          msg4="LAB:Software Engineering";
          intent.putExtra(MSG4,msg4);
      }
      else if(findViewById(R.id.imageButton10)==view)
      {
          msg1="-";
          intent.putExtra(MSG1,msg1);
          msg2="-";
          intent.putExtra(MSG2,msg2);
          msg3="-";
          intent.putExtra(MSG3,msg3);
          msg4="-";
          intent.putExtra(MSG4,msg4);
      }
      startActivity(intent);
  }
}