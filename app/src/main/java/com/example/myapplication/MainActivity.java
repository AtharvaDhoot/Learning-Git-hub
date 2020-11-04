package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imagedice;
    //    private Random random = new Random();
    private Random random = new Random();
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagedice = findViewById(R.id.imageView);
        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rolldice();
            }
        });
//        imagedice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                rolldice();
//            }
//        });
    }

    private void rolldice() {
        int myrannum = random.nextInt(6) + 1;

        switch (myrannum) {
            case 1:
                imagedice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imagedice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imagedice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imagedice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imagedice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imagedice.setImageResource(R.drawable.dice6);
                break;
        }
    }
}