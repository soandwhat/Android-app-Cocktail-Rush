package com.rush.cocktailrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class LoginCocktails extends AppCompatActivity {

    ImageButton in;
    Intent coming;
    AwesomeValidation kak;
    EditText log,pas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_cocktails);

        log = findViewById(R.id.login);
        pas = findViewById(R.id.password);
        kak = new AwesomeValidation(ValidationStyle.BASIC);

        kak.addValidation(this, R.id.login, RegexTemplate.NOT_EMPTY,R.string.invalid_full_name);
        kak.addValidation(this, R.id.password,".{6,}",R.string.invalid_password);

        in = findViewById(R.id.kno_in);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kak.validate()) {
                    Intent intent = new Intent(LoginCocktails.this, Cocktails.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void up(View view)
    {
        coming = new Intent(this, SignCocktails.class);
        startActivity(coming);
    }
}