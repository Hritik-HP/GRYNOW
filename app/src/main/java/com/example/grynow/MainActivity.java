package com.example.grynow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "";
    EditText phone;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = findViewById(R.id.editTextPhone);
        login = findViewById(R.id.login);
    }







    public void btn(View view) {
        String number = phone.getText().toString();
        if(number.length()==10){

            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(this, "Please Enter 10 Digit Number", Toast.LENGTH_SHORT).show();
        }

    }

}