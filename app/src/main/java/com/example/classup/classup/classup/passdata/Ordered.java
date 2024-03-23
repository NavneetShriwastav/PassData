package com.example.classup.classup.classup.passdata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.classup.classup.classup.passdata.databinding.ActivityOrderedBinding;

public class Ordered extends AppCompatActivity {
    private ActivityOrderedBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout using view binding
        binding = ActivityOrderedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Retrieve the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra("keyMessage");

        // Find the TextView using the binding object and set the message
        TextView tv = binding.tv;
        tv.setText(message);
    }
}
