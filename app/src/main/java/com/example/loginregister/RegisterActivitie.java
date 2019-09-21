package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivitie extends AppCompatActivity {

    private EditText userNameRegister;
    private EditText passwordRegister;
    private EditText confirmPassRegister;
    private Button buttonRegisterRegisterActivitie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activitie);

        userNameRegister = findViewById(R.id.editTextUserNameRegisterActivitie);
        passwordRegister = findViewById(R.id.editTextPassRegisterActivitie);
        confirmPassRegister = findViewById(R.id.editTextConfirmPassRegisterActivitie);
        buttonRegisterRegisterActivitie = findViewById(R.id.buttonRegisterRegisterActivitie);

        buttonRegisterRegisterActivitie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(passwordRegister.getText().toString().equals(confirmPassRegister.getText().toString())){

                    Intent intentRegistrado = new Intent(RegisterActivitie.this, MainActivity.class);
                    startActivity(intentRegistrado);
                } else {
                    String mensajeAMostrar = "Las contrasenas no coinciden";
                    Toast.makeText(RegisterActivitie.this, mensajeAMostrar, Toast.LENGTH_SHORT).show();
                    return;
                }





            }
        });



    }
}
