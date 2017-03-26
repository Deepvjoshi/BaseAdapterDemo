package com.deepjoshi.chocopyk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ForgotPasswordActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        final Button btn =(Button)findViewById(R.id.btn_);

        final EditText passwordET=(EditText)  findViewById(R.id.et_password);
    btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String strpwd = passwordET.getText().toString();


        if (strpwd.isEmpty())

        {
            Toast.makeText(ForgotPasswordActivity.this, "Email cannot be empty!", Toast.LENGTH_SHORT).show();

        }

else {
            Intent i =new Intent(ForgotPasswordActivity.this,Log_in.class);
            startActivity(i);

        }
    }
});

    }
}
