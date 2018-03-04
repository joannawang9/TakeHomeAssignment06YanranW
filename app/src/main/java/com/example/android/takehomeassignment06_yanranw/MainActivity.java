package com.example.android.takehomeassignment06_yanranw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText amount;
    EditText tax;
    EditText tip;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Tip Calculator");

        amount = findViewById(R.id.amount);
        tax = findViewById(R.id.tax);
        tip = findViewById(R.id.tip);
        submit = findViewById(R.id.submit);
    }


    public void onClick(View view) {
        double mAmount;
        try {
            mAmount = Double.parseDouble(amount.getText().toString());
        } catch (NumberFormatException ex) {
            mAmount = 0;
        }
        double mTax;
        try {
            mTax = Double.parseDouble(tax.getText().toString());
        } catch (NumberFormatException ex) {
            mTax = 0;
        }
        double mTip;
        try {
            mTip = Double.parseDouble(tip.getText().toString());
        } catch (NumberFormatException ex) {
            mTip = 0;
        }
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("double1", mAmount);
        intent.putExtra("double2", mTax);
        intent.putExtra("double3", mTip);
        startActivity(intent);


    }
}
