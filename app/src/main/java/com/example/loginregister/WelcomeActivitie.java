package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivitie extends AppCompatActivity {

    public static final String USER_NAME = "userName";
    private TextView textViewBienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_activitie);

        textViewBienvenida = findViewById(R.id.texViewBienvenida);
        Intent intentUserName = getIntent();

        Bundle bundleRecibido = intentUserName.getExtras();
        String userName = bundleRecibido.getString(USER_NAME);
        String textoBienvenida = "Welcome to your APP " + userName;

        textViewBienvenida.setText(textoBienvenida);


    }
}
