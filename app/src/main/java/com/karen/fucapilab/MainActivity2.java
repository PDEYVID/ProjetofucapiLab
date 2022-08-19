package com.karen.fucapilab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.karen.fucapilab.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void entrarClicado(View view) {

        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
