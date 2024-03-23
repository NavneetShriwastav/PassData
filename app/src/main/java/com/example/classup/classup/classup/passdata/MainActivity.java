package com.example.classup.classup.classup.passdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.classup.classup.classup.passdata.databinding.ActivityMainBinding; // Import your binding class

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding; // Declare your binding object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       binding = ActivityMainBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());

       Button bt = binding.bt;
        EditText et1 = binding.et1;
        EditText et2 = binding.et2;
        EditText et3 = binding.et3;
        EditText et4 = binding.et4;

       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String s = et1.getText().toString()+","+et2.getText().toString()+","+et3.getText().toString()+","+et4.getText().toString()+"ORDERED";
               Intent intent = new Intent(MainActivity.this,Ordered.class);
               intent.putExtra("keyMessage",s);
               startActivity(intent);
           }
       });

    }
}
