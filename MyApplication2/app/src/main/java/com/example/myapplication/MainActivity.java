package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity
{
    float a, b, c;
    String screenText , sign , signed , calcresult;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        signed="0";
        screenText="";
        calcresult="0";
    }
    public void onClickNum(View view)
    {
        calcresult="0";
        if (signed.equals("0"))
        {
            Button button = (Button) view;
            screenText+= button.getText().toString();
            result.setText(screenText);
            a = Float.parseFloat(screenText);
        }
        else
        {
           Button button=(Button) view;
           screenText += button.getText().toString();
           result.setText(screenText);
           b = Float.parseFloat(screenText);

        }
    }

    public void OnClicOper(View view)
    {
      Button button = (Button) view;
      sign=button.getText().toString();
      result.setText(sign);
      signed="1";
      screenText="";
    }

    public void OnClickCalc(View view)
    {
        Button button= (Button) view;

        if (sign.equals("+"))
        {
          c = a+b;
        }
        else if(sign.equals("-"))
        {
           c = a-b;
        }
        else if(sign.equals("×"))
        {
           c = a*b;
        }
        else if(sign.equals("÷"))
        {
           c = a/b;
        }

        calcresult = Float.toString(c);
        result.setText(calcresult);
        screenText="0";
        signed="0";
    }

    public void reset (View view)
    {
        Button button=(Button) view;
        signed="0";
        screenText="";
        calcresult="0";
        result.setText("0");
    }
}


