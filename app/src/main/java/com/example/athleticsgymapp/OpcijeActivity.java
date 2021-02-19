package com.example.athleticsgymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcijeActivity extends AppCompatActivity {

    private Button btnTreninzi, btnCenovnik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcije);

        inicijalizacija();
        //OVAKO PO METODAMA RAZDOVJTE HANDLERE ZA SVAKI BUTTON DA NE BI BILO NAGURANO SVE OVDE
        handleTreninzi();
        handleCenovnik();

    }

    //OVDE INICIJALIZUJTE SVE BUTTONE I SVE STO VAM TREBA, MORAMO SVE DA RAZDVOJIMO PO METODAMA ZATO STO CE BITI PUNO OVDE!!
    private void inicijalizacija(){
        btnTreninzi=findViewById(R.id.btnTreninziOpcije);
        btnCenovnik = findViewById(R.id.btnCenovnik);
    }

    private void handleTreninzi(){
        btnTreninzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcijeActivity.this,TreninziActivity.class);
                startActivity(intent);
            }
        });
    }

    private void handleCenovnik(){
        btnCenovnik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcijeActivity.this,CenovnikActivity.class);
                startActivity(intent);
            }
        });
    }



}