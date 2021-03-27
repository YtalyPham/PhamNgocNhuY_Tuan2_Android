package com.example.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bai3 extends AppCompatActivity {
    TextView showResult;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        TextView someTextView = (TextView) findViewById(R.id.textView4);
        someTextView.setText("141.900 đ");
        someTextView.setPaintFlags(someTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        showResult=(TextView) findViewById(R.id.counterValue);

    }

    public void countPlus(View view){
        counter++;
        showResult.setText(Integer.toString(counter));
    }
    public void countMinus(View view){
        if(counter>0){
            counter--;
        }
        else{
            counter=0;
        }
        showResult.setText(Integer.toString(counter));
    }
}