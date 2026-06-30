package com.example.brunoatividadeiiapiibimii;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.brunoatividadeiiapiibimii.controller.ClienteController;
import com.example.brunoatividadeiiapiibimii.model.Cliente;

public class AlterarDadosActivity extends AppCompatActivity {


    EditText editNome, editEmail, editTelefone;
    Button btnSalvar, btnCancelar;

    Cliente cliente;
    ClienteController controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alterar_dados);
        editNome = findViewById(R.id.edtEmail);
        editEmail = findViewById(R.id.edtEmail);
        editTelefone = findViewById(R.id.edtTelefone);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnCancelar = findViewById(R.id.btnCancelar);

        controller = new ClienteController(this);

        // Recebe o objeto cliente da Intent
        cliente = (Cliente) getIntent().getSerializableExtra("cliente");

        if (cliente != null) {
            editNome.setText(cliente.getNome());
            editEmail.setText(cliente.getEmail());
            editTelefone.setText(cliente.getTelefone());
        }
        btnSalvar.setOnClickListener(v -> {cliente.setNome(editNome.getText().toString());
            cliente.setEmail(editEmail.getText().toString());
            cliente.setTelefone(editTelefone.getText().toString());

            controller.alterar(cliente);

            Toast.makeText(this, "Cliente alterado com sucesso!", Toast.LENGTH_SHORT).show();

            finish();
        });
        btnCancelar.setOnClickListener(v -> {
            finish();
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}