package com.example.demoontap.home;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demoontap.R;

public class Register extends AppCompatActivity {
private EditText edtEmailRegister, edtPasswordRegister;
private Button btnRegister;
private TextView tvLoginWithAcount;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtEmailRegister = findViewById(R.id.edtEmailRegister);
        edtPasswordRegister = findViewById(R.id.edtPasswordRegister);
        btnRegister = findViewById(R.id.btnRegister);
        tvLoginWithAcount = findViewById(R.id.loginVithAccount);
  btnRegister.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          String email, password;

          email = edtEmailRegister.getText().toString();
          password = edtPasswordRegister.getText().toString();

          if(TextUtils.isEmpty(email)){
              Toast.makeText(getApplicationContext(),"Enter email!!",Toast.LENGTH_SHORT).show();
              return;
          }
          if(TextUtils.isEmpty(password)){
              Toast.makeText(getApplicationContext(),"Enter password!!",Toast.LENGTH_SHORT).show();
              return;
          }
      }
  });


    }
}