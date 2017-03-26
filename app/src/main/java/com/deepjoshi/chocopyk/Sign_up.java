package com.deepjoshi.chocopyk;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sign_up extends AppCompatActivity {

    private Spinner spinner_state;
    private Spinner spinner_city;
    private Spinner spinner_area;
    private Spinner spinner_type;
    private Spinner spinner_sec;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        final EditText nameET=(EditText)findViewById(R.id.edittext_name_edittext );
        final EditText lastnameET=(EditText)findViewById(R.id.edittext_lastname_edittext );
        final EditText emailET=(EditText)  findViewById(R.id.editext_email_edittext );

        final EditText passwordET=(EditText)findViewById(R.id.edittext_pass_edittext );
        final EditText confirmpasswordET=(EditText)  findViewById(R.id.edittext_conpassword_edittext );
       // final TextView genderTV=(TextView)findViewById(R.id.textview_gender_textview );
//        final RadioButton maleRB=(RadioButton)findViewById(R.id.RBmale );
//        final RadioButton femaleRB=(RadioButton)findViewById(R.id.RBfemale );
        final EditText conET=(EditText )findViewById(R.id.editText_contact_edittext );
        final EditText address=(EditText)findViewById(R.id.edittext_address_edittext);
        final EditText username=(EditText)findViewById(R.id.edittext_username_edittext) ;

        Button btnsignup;
        btnsignup=(Button )findViewById(R.id.signup_btn_signup );
        btnsignup .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strname = nameET.getText().toString();
                String strlastname = lastnameET.getText().toString();
                String strlAddrs = address.getText().toString();
                String stremail = emailET.getText().toString();
                String strpassword = passwordET.getText().toString();
              String strconfirmpassword = confirmpasswordET.getText().toString();
                String usernamestr = username.getText().toString();

//               username String strgender = genderTV.getText().toString();
//                {
//                    if (maleRB.isChecked()) {
//                        maleRB.getText().toString();
//                    } else {
//                        femaleRB.getText().toString();
//                    }
//                }
                String strcontactno = conET.getText().toString();
                if (strname.isEmpty()) {
                    Toast.makeText(Sign_up.this, "please enter name", Toast.LENGTH_SHORT).show();
                } else if (strlastname.isEmpty()) {
                    Toast.makeText(Sign_up.this, "please enter lastname", Toast.LENGTH_SHORT).show();
                } else if (stremail.isEmpty()) {
                    Toast.makeText(Sign_up.this, "please enter your email", Toast.LENGTH_SHORT).show();
                } else if (!isValidEmail(stremail)) {
                    Toast.makeText(Sign_up.this, "enter valid email ", Toast.LENGTH_SHORT).show();
                } else if (strpassword.isEmpty()) {
                    Toast.makeText(Sign_up.this, "please enter password", Toast.LENGTH_SHORT).show();
                } else if (strconfirmpassword.isEmpty()) {
                    Toast.makeText(Sign_up.this, "please enter confirm password", Toast.LENGTH_SHORT).show();
                } else if (strcontactno.isEmpty()) {
                    Toast.makeText(Sign_up.this, "please enter contact no", Toast.LENGTH_SHORT).show();
                }
                else if (!strconfirmpassword.equals(strpassword)) {
                    Toast.makeText(Sign_up.this, "password don't match", Toast.LENGTH_SHORT).show();
                }

else {
                    Intent i =new Intent(Sign_up.this,MainActivity.class);
                    startActivity(i);

                }
            }


        });



    }

    public static boolean isValidEmail(CharSequence target)
    {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern =Pattern .compile(EMAIL_PATTERN );
        matcher =pattern .matcher(target ) ;
        return matcher.matches() ;
    }

}