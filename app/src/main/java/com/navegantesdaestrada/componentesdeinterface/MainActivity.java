package com.navegantesdaestrada.componentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickBotao(View view){
        ImageView primeironao = findViewById(R.id.imgNao);
        ImageView psegundoonao = findViewById(R.id.imgNao2);
        primeironao.setImageResource(R.drawable.branco);
        psegundoonao.setImageResource(R.drawable.nao);
        }
    public void clickBotao2(View view){
        ImageView primeironao = findViewById(R.id.imgNao);
        ImageView psegundoonao = findViewById(R.id.imgNao2);
        primeironao.setImageResource(R.drawable.nao);
        psegundoonao.setImageResource(R.drawable.branco);
    }
    public void clickBotao3(View view){
        ImageView eusabia = findViewById(R.id.eusabia);
        eusabia.setImageResource(R.drawable.eusabia);
}}
