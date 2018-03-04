package com.example.android.takehomeassignment06_yanranw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Your Receipt");

        Bundle main = getIntent().getExtras();
        double amount = main.getDouble("double1");
        double tax = main.getDouble("double2");
        double tip = main.getDouble("double3");

        TextView receipt = findViewById(R.id.receipt);
        receipt.setText("Total: " + amount + "\nSales Tax: " + amount * tax + "\nTip: " + amount * tip + "\nGrand Total: " + String.format("%.2f", amount * (1 + tax + tip)));
        ;
    }
}
