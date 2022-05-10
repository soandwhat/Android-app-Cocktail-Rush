package com.rush.cocktailrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class SignCocktails extends AppCompatActivity {

    ImageButton sign_btn;
    EditText email,passsing,con;
    AwesomeValidation sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_cocktails);

        email = findViewById(R.id.emailAdress);
        passsing = findViewById(R.id.editTextPassword);
        con = findViewById(R.id.confirmPassword);
        sign = new AwesomeValidation(ValidationStyle.BASIC);

        sign.addValidation(this, R.id.emailAdress, Patterns.EMAIL_ADDRESS,R.string.invalid_email);
        sign.addValidation(this, R.id.editTextPassword,".{6,}",R.string.invalid_password);
        sign.addValidation(this, R.id.confirmPassword,R.id.editTextPassword,R.string.invalid_confirm_password);

        sign_btn = findViewById(R.id.button4);
        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sign.validate()) {
                    Intent intent = new Intent(SignCocktails.this, Cocktails.class);
                    startActivity(intent);
                }
            }
        });
    }
}