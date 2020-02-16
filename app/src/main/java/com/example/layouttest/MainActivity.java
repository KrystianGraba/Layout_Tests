package com.example.layouttest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = findViewById(R.id.bt1);
        Button bt2 = findViewById(R.id.bt2);
        Button bt3 = findViewById(R.id.bt3);
        Button bt4 = findViewById(R.id.bt4);
        Button bt5 = findViewById(R.id.bt5);
        Button bt6 = findViewById(R.id.bt6);
        Button bt7 = findViewById(R.id.bt7);
        Button bt8 = findViewById(R.id.bt8);
        Button bt9 = findViewById(R.id.bt9);
        Button bt_reset = findViewById(R.id.bt_reset);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt_reset.setOnClickListener(this);

        ImageView img = findViewById(R.id.image);
        img.setVisibility(View.INVISIBLE);


    }

    @Override
    public void onClick(View view) {
        TextView tv1 = findViewById(R.id.t1);
        TextView tv2 = findViewById(R.id.t2);
        TextView tv3 = findViewById(R.id.t3);
        TextView tv4 = findViewById(R.id.t4);
        TextView tv5 = findViewById(R.id.t5);
        TextView tv6 = findViewById(R.id.t6);
        TextView tv7 = findViewById(R.id.t7);
        TextView tv8 = findViewById(R.id.t8);
        TextView tv9 = findViewById(R.id.t9);

        ImageView img = findViewById(R.id.image);


        switch (view.getId()) {
            case R.id.bt1:
                Toast.makeText(this, "1 klik", Toast.LENGTH_SHORT).show();
                tv1.setText(getString(R.string.click));
                i++;
                break;
            case R.id.bt2:
                Toast.makeText(this, "2 klik", Toast.LENGTH_SHORT).show();
                tv2.setText(getString(R.string.click));
                i++;
                break;
            case R.id.bt3:
                Toast.makeText(this, "3 klik", Toast.LENGTH_SHORT).show();
                tv3.setText(getString(R.string.click));
                i++;
                break;
            case R.id.bt4:
                Toast.makeText(this, "4 klik", Toast.LENGTH_SHORT).show();
                tv4.setText(getString(R.string.click));
                i++;
                break;
            case R.id.bt5:
                Toast.makeText(this, "5 klik", Toast.LENGTH_SHORT).show();
                tv5.setText(getString(R.string.click));
                i++;
                break;
            case R.id.bt6:
                Toast.makeText(this, "6 klik", Toast.LENGTH_SHORT).show();
                tv6.setText(getString(R.string.click));
                i++;
                break;
            case R.id.bt7:
                Toast.makeText(this, "7 klik", Toast.LENGTH_SHORT).show();
                tv7.setText(getString(R.string.click));
                i++;
                break;
            case R.id.bt8:
                Toast.makeText(this, "8 klik", Toast.LENGTH_SHORT).show();
                tv8.setText(getString(R.string.click));
                i++;
                break;
            case R.id.bt9:
                Toast.makeText(this, "9 klik", Toast.LENGTH_SHORT).show();
                tv9.setText(getString(R.string.click));
                i++;
                break;
            case R.id.bt_reset:
                Toast.makeText(this, "Reset", Toast.LENGTH_SHORT).show();
                i = 0;
                tv1.setText(getString(R.string.def));
                tv2.setText(getString(R.string.def));
                tv3.setText(getString(R.string.def));
                tv4.setText(getString(R.string.def));
                tv5.setText(getString(R.string.def));
                tv6.setText(getString(R.string.def));
                tv7.setText(getString(R.string.def));
                tv8.setText(getString(R.string.def));
                tv9.setText(getString(R.string.def));
                img.setVisibility(View.INVISIBLE);
                break;
        }


        if (i > 9) {
            img.setVisibility(View.VISIBLE);
        }


    }
}
