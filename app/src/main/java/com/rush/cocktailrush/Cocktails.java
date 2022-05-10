package com.rush.cocktailrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cocktails extends AppCompatActivity {

    Intent cranBerry,sangria,bellini,mary,nojito,mule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktails);

    }
    public void cardCranberry(View view)
    {
        cranBerry = new Intent(this, CranberryActivity.class);
        startActivity(cranBerry);
    }

    public void cardSangriaPunch(View view)
    {
        sangria = new Intent(this, SangriaActivity.class);
        startActivity(sangria);
    }

    public void cardBellini(View view)
    {
        bellini = new Intent(this, BelliniActivity.class);
        startActivity(bellini);
    }

    public void cardVirginMary(View view)
    {
        mary = new Intent(this, MaryActivity.class);
        startActivity(mary);
    }

    public void cardBlackberryNojito(View view)
    {
        nojito = new Intent(this, NojitoActivity.class);
        startActivity(nojito);
    }

    public void cardMuleMocktail(View view)
    {
        mule = new Intent(this, MuleActivity.class);
        startActivity(mule);
    }
}