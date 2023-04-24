package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_result extends AppCompatActivity {
    TextView a;
    TextView b;
    TextView res;

    int sa,sb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        a=findViewById(R.id.textView9);
        b=findViewById(R.id.textView10);
        res=findViewById(R.id.textView11);
        final Intent intent1=getIntent();
        String aa=intent1.getStringExtra("Ascore");
        String bb=intent1.getStringExtra("Bscore");
        a.setText(String.valueOf(aa));
        b.setText(String.valueOf(bb));
        sa= Integer.parseInt(String.valueOf(aa));
        sb= Integer.parseInt(String.valueOf(bb));
        if(sa>sb){
            res.setText("A is winner");
        } else if (sb>sa) {
            res.setText("B is winner");
        } else if (sa==sb&&sa>0&&sb>0) {
            res.setText("Match Draw");
        }else {
            res.setText("Match not yet started");
        }
    }
}
