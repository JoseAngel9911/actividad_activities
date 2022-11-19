package com.programacionandroid.actividad_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Runnable{

    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Ejecutando el onCreate", Toast.LENGTH_SHORT).show();
        txt1=findViewById(R.id.txtAct1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Ejecutando el onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Ejecutando el onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Ejecutando el onStop", Toast.LENGTH_SHORT).show();
        txt1.removeCallbacks(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Ejecutando el onResume", Toast.LENGTH_SHORT).show();
        run();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Ejecutando el onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Ejecutando el onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void run() {
        int x=Integer.parseInt(txt1.getText().toString())+1;
        txt1.setText(String.valueOf(x));
        txt1.postDelayed(this,1000);
    }
}