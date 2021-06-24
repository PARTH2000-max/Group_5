package com.example.raj2.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.raj2.Ayush.MainActivity2;
import com.example.raj2.MainActivity;
import com.example.raj2.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView tv_register,newaccount;
    private String PREF="1";

    TextInputLayout tl_email,tl_password;
    EditText email,password;
    Button btn_login,reg1;

    EditText editText;

    //cec work
    private static String captcha;
    TextView cap;
    android.widget.EditText c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.et_input_email);
        password = (EditText) findViewById(R.id.et_input_password);
        tl_email = (TextInputLayout) findViewById(R.id.input_email);
        tl_password = (TextInputLayout) findViewById(R.id.input_password);
        btn_login = findViewById(R.id.btn_login);

        //cec work
        cap = findViewById(R.id.cap);
        c = (EditText) findViewById(R.id.captcha);
        captcha = getCaptcha();
        cap.setText(captcha);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String useremail = email.getText().toString();
                String userpass = password.getText().toString();
                String usercaptcha = c.getText().toString();
                String matchcaptcha = cap.getText().toString();

                if (useremail.isEmpty()) {
                    email.requestFocus();
                    email.setError("Please Enter Your Email");
                    return;
                }

                if (!Patterns.EMAIL_ADDRESS.matcher(useremail).matches()) {
                    email.requestFocus();
                    email.setError("Please Enter correct Email");
                    return;
                }

                if (userpass.isEmpty()) {
                    password.requestFocus();
                    password.setError("Please Enter Your Password");
                    return;
                }

                if (userpass.length() < 8) {
                    password.requestFocus();
                    password.setError("Please Enter Your Password Greater Than 8");
                    return;
                }

                if (usercaptcha.isEmpty()) {
                    c.requestFocus();
                    c.setError("Please Enter your Captcha");
                    return;
                }

                if (!(usercaptcha.equals(matchcaptcha))) {
                    c.requestFocus();
                    c.setError("Please Enter Valid Captha");
                } else {
                    Intent intent = new Intent(LoginActivity.this, MainActivity2.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
    private String getCaptcha() {
        char data[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'};
        char numeric[]= { '0', '1', '2', '3', '4', '5', '6',
                '7', '8', '9' };
        char spec_chars[]= {'@','_','-','&'};
        char index[] = new char[8];

        Random r = new Random();
        int i = 0;

        for (i = 0; i < (index.length-3); i++) {
            int ran = r.nextInt(data.length);
            index[i] = data[ran];
        }

        for (int j = 0; j < 2; j++) {
            int ran = r.nextInt(numeric.length);
            index[i] = numeric[ran];
            i=i+1;
        }

        for (int k = 0; k < 1; k++) {
            int ran = r.nextInt(spec_chars.length);
            index[i] = spec_chars[ran];
            i=i+1;
        }

        return new String(index);
    }


   }

   
