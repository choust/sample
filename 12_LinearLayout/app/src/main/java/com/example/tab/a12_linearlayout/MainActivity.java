package com.example.tab.a12_linearlayout;

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

    public void show_horizontal_layout(View view) {
        Intent intent = new Intent(this, LinearlayoutHorizontalActivity.class);
        startActivity(intent);
    }

    public void show_vertical_layout(View view) {
        Intent intent = new Intent(this, LinearlayoutVerticalActivity.class);
        startActivity(intent);
    }
}
