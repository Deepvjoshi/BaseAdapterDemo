package com.deepjoshi.chocopyk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Log_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        final EditText emailId=(EditText)findViewById(R.id.login_edittext_eid);
        final EditText passWord=(EditText)findViewById(R.id.login_edittext_password);
        Button btFg=(Button)findViewById(R.id.login_button_frgtPasswrd);
        Button bt=(Button)findViewById(R.id.login_button_signup);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Log_in.this,Sign_up.class);
                startActivity(i);
            }


        });
        btFg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i =new Intent(Log_in.this,ForgotPasswordActivity.class);
                startActivity(i);
            }
        });
        Button bt2=(Button)findViewById(R.id.login_button_login);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stremail = emailId.getText().toString();
                String strpwd = passWord.getText().toString();


                if (stremail.isEmpty())

                {
                    Toast.makeText(Log_in.this, "Email cannot be empty!", Toast.LENGTH_SHORT).show();

                } else if (strpwd.isEmpty())

                {
                    Toast.makeText(Log_in.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();

                } else

                {


                    Intent i =new Intent(Log_in.this,MainActivity.class);
                    startActivity(i);


                }
//
            }
//
        });
    }



}