package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView score1;
    private TextView score2;
    private int s1=0,s2=0;
    Button reset,result,addbutton1,addbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset=findViewById(R.id.button3);
        score1=findViewById(R.id.textView3);
        score2=findViewById(R.id.textView4);
        addbutton1=findViewById(R.id.button);
        addbutton2=findViewById(R.id.button2);
        result=findViewById(R.id.button4);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=0;
                s2=0;
                score1.setText(String.valueOf(s1));
                score2.setText(String.valueOf(s2));
            }
        });
        addbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1++;
                score1.setText(String.valueOf(s1));
            }
        });
        addbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2++;
                score2.setText(String.valueOf(s2));
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,activity_result.class);
                intent.putExtra("Ascore",score1.getText().toString());
                intent.putExtra("Bscore",score2.getText().toString());
                startActivity(intent);
            }
        });
    }
}