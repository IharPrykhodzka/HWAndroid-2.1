package com.example.hwandroid_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Print();
        Clean();

    }

    public void Print() {
        Button btmOk = findViewById(R.id.btmOk);
        btmOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final TextView textTotal = findViewById(R.id.textTotal);
                final TextView textLogin = findViewById(R.id.editTextLogin);
                final TextView textEmail = findViewById(R.id.editTextEmail);

                String str = ("Подписка на рассылку успешно оформлена для пользователя ")
                        + textLogin.getText() + (" на электронный адрес ")
                        + textEmail.getText();
                textTotal.setText(str);
            }
        });
    }

    public void Clean() {
        Button btmClean = findViewById(R.id.btmClean);
        btmClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final TextView textTotal = findViewById(R.id.textTotal);
                final TextView textLogin = findViewById(R.id.editTextLogin);
                final TextView textEmail = findViewById(R.id.editTextEmail);

                textTotal.setText("");
                textEmail.setText("");
                textLogin.setText("");
            }
        });
    }
}
