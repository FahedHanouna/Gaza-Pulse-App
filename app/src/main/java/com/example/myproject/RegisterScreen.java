package com.example.myproject;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterScreen extends AppCompatActivity {

    private EditText etRegisterName, etRegisterUsername, etRegisterEmail, etRegisterPassword, etRegisterBirthDate;
    private Button btnRegister;
    private TextView tvGoToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        etRegisterName = findViewById(R.id.etRegisterName);
        etRegisterUsername = findViewById(R.id.etRegisterUsername);
        etRegisterEmail = findViewById(R.id.etRegisterEmail);
        etRegisterPassword = findViewById(R.id.etRegisterPassword);
        etRegisterBirthDate = findViewById(R.id.etRegisterBirthDate);
        btnRegister = findViewById(R.id.btnRegister);
        tvGoToLogin = findViewById(R.id.tvGoToLogin);

        etRegisterBirthDate.setFocusable(false);
        etRegisterBirthDate.setClickable(true);

        etRegisterBirthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int defaultYear = 2007;
                int defaultMonth = 0;
                int defaultDay = 1;

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        RegisterScreen.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                                etRegisterBirthDate.setText(selectedDate);
                            }
                        }, defaultYear, defaultMonth, defaultDay);

                datePickerDialog.show();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etRegisterName.getText().toString().trim();
                String username = etRegisterUsername.getText().toString().trim();
                String email = etRegisterEmail.getText().toString().trim();
                String password = etRegisterPassword.getText().toString().trim();
                String birthDate = etRegisterBirthDate.getText().toString().trim();

                if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || birthDate.isEmpty()) {
                    Toast.makeText(RegisterScreen.this, "الرجاء ملء جميع الحقول بما فيها تاريخ الميلاد", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterScreen.this, "تم تسجيل الحساب بنجاح!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(RegisterScreen.this, bottom.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        tvGoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterScreen.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}