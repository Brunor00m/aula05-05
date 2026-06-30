package com.example.brunoatividadeiiapiibimii.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.brunoatividadeiiapiibimii.AlterarDadosActivity;
import com.example.brunoatividadeiiapiibimii.R;
import com.example.brunoatividadeiiapiibimii.controller.ClienteController;

public class MainActivity extends AppCompatActivity {
    Button btnAlterar;

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnAlterar = findViewById(R.id.btn_alterar);

        btnAlterar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AlterarDadosActivity.class);
            startActivity(intent);
        });

        clienteController = new ClienteController(this);




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}