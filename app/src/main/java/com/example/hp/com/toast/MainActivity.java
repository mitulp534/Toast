package com.example.hp.com.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void process(View v){
        Toast toast=Toast.makeText(this,"This is toast example",Toast.LENGTH_SHORT);
        toast.show();

    }
}
