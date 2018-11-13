package com.lourdinas.simulandochamada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TelefoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone);

        TextView txtNumero = findViewById(R.id.txt_numero);
        Button btnApagar =findViewById(R.id.btn_c);
        Button btn0 =findViewById(R.id.btn_0);
        Button btn1 =findViewById(R.id.btn_1);
        Button btn2 =findViewById(R.id.btn_2);
        Button btn3 =findViewById(R.id.btn_3);
        Button btn4 =findViewById(R.id.btn_4);
        Button btn5 =findViewById(R.id.btn_5);
        Button btn6 =findViewById(R.id.btn_6);
        Button btn7 =findViewById(R.id.btn_7);
        Button btn8 =findViewById(R.id.btn_8);
        Button btnasterisco =findViewById(R.id.btn_asterisco);
        Button btnvelha =findViewById(R.id.btn_velha);
    }
}
