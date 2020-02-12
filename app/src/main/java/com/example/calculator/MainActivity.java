package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCos, btnSec, btnTan, btnCsc, btnCtn, btnSin, btnLog;
    private TextView tvHasil;
    private EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCos = findViewById(R.id.cos);
        btnSin = findViewById(R.id.sin);
        btnSec = findViewById(R.id.sec);
        btnCsc = findViewById(R.id.cosec);
        btnTan = findViewById(R.id.tan);
        btnCtn = findViewById(R.id.cotan);
        btnLog = findViewById(R.id.logaritma);
        tvHasil = findViewById(R.id.hasil);
        etInput = findViewById(R.id.line);

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.cos(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.sin(input);;
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.tan(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = 1/Math.sin(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = 1/Math.cos(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = 1/Math.tan(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.log10(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
