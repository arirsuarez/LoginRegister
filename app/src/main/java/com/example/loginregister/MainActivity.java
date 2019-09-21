package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.loginregister.WelcomeActivitie.USER_NAME;

public class MainActivity extends AppCompatActivity {

    private Button buttonLogin;
    private Button buttonRegister;
    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);
        editTextUsername = findViewById(R.id.editTextUserName);
        editTextPassword = findViewById(R.id.editTextPassword);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editTextUsername.getText().toString().length() > 0 && editTextPassword.getText().toString().length() > 0) {

                    String nombreDeUsuario = editTextUsername.getText().toString();

                    Intent intentLogin = new Intent(MainActivity.this, WelcomeActivitie.class);
                    Bundle bundleNombreDeUsuario = new Bundle();

                    bundleNombreDeUsuario.putString(USER_NAME, nombreDeUsuario);
                    intentLogin.putExtras(bundleNombreDeUsuario);
                    startActivity(intentLogin);
                }

            }

        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegister = new Intent(MainActivity.this, RegisterActivitie.class);
                startActivity(intentRegister);
            }
        });
    }
}
