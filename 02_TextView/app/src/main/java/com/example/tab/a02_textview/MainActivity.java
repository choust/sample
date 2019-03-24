package com.example.tab.a02_textview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showActivityGravity(View view) {
        Intent mintent = new Intent(MainActivity.this, GravityActivity.class);
        startActivity(mintent);
    }
}
