package com.example.raj2.Ayush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.raj2.R;

public class Login_activity extends AppCompatActivity {
    EditText etusername , etpassword;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        etusername=findViewById(R.id.etusername);
        etpassword=findViewById(R.id.etpassword);

        btn_login=findViewById(R.id.btn_login);

      btn_login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              if (etusername.getText().toString().equals("admin") && etpassword.getText().toString().equals("admin")) {

                  Intent intent=new Intent(Login_activity.this, MainActivity2.class);
                  intent.putExtra("loggedInUser",etusername.getText().toString());
                  startActivity(intent);
                  finish();
                  Shared shared=new Shared(getApplicationContext());
                  shared.secondtime();


              }

          }
      });





    }
}