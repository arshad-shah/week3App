package com.example.week3app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);


        final EditText text1 = findViewById(R.id.editField);
        final TextView text2 = findViewById(R.id.label);



        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Button 1 pressed",Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Button 2 pressed",Toast.LENGTH_LONG).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                text2.setText(text1.getText().toString());
            }
        });

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button1){
            Toast.makeText(this,"Button 1 pressed",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Button 2 pressed",Toast.LENGTH_LONG).show();
        }
    }

//    public void showToast1(View view){
//        Toast.makeText(this,"Button 1 pressed",Toast.LENGTH_LONG).show();
//    }
//    public void showToast2(View view){
//        Toast.makeText(this,"Button 2 pressed",Toast.LENGTH_LONG).show();
//    }
}