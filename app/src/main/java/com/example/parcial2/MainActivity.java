package com.example.parcial2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn_iniciarsesion;
    EditText txt_user;
    EditText txt_password;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public static final String datauser = "datauser";
    public static final int modo_private = Context.MODE_PRIVATE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_user = findViewById(R.id.txt_user);
        txt_password = findViewById(R.id.txt_password);
        btn_iniciarsesion = findViewById(R.id.btn_iniciosesion);
        sharedPreferences = getSharedPreferences(datauser, modo_private);
        editor = sharedPreferences.edit();
        btn_iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v_user = txt_user.getText().toString();
                String v_pass = txt_password.getText().toString();
                if (!v_user.equals("") ^ !v_pass.equals("")){
                    editor.putString("user", txt_user.getText().toString());
                    editor.commit();
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                }
            }
        });
    }
}