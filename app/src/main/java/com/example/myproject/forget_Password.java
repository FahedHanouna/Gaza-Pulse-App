package com.example.myproject;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class forget_Password extends AppCompatActivity {

    private TextInputEditText etForgotEmail;
    private Button btnResetPassword;
    private TextView tvBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        etForgotEmail = findViewById(R.id.etForgotEmail);
        btnResetPassword = findViewById(R.id.btnResetPassword);
        tvBackToLogin = findViewById(R.id.tvBackToLogin);

        btnResetPassword.setOnClickListener(v -> {
            String email = etForgotEmail.getText().toString().trim();

            if (email.isEmpty()) {
                etForgotEmail.setError("Email field cannot be empty");
                etForgotEmail.requestFocus();
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etForgotEmail.setError("Please enter a valid email address");
                etForgotEmail.requestFocus();
                return;
            }

            Toast.makeText(forget_Password.this,
                    "Reset link has been sent to: " + email, Toast.LENGTH_LONG).show();

            finish();
        });

        tvBackToLogin.setOnClickListener(v -> {
            finish();
        });
    }
}