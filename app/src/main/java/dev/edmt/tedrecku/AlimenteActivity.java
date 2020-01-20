package dev.edmt.tedrecku;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

import dev.edmt.tedrecku.Alimente.BananaActivity;
import dev.edmt.tedrecku.Alimente.CaiseActivity;
import dev.edmt.tedrecku.Alimente.CartofActivity;
import dev.edmt.tedrecku.Alimente.CascavalActivity;
import dev.edmt.tedrecku.Alimente.CastravetiActivity;
import dev.edmt.tedrecku.Alimente.FulgiDeOvazActivity;
import dev.edmt.tedrecku.Alimente.LapteActivity;
import dev.edmt.tedrecku.Alimente.MarActivity;
import dev.edmt.tedrecku.Alimente.OuaActivity;
import dev.edmt.tedrecku.Alimente.SpanacActivity;
import dev.edmt.tedrecku.Alimente.UsturoiActivity;
import dev.edmt.tedrecku.Alimente.VitaGrasaActivity;

public class AlimenteActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimente);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);




        button = (Button) findViewById(R.id.buttonBanana);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBananaActivity();
            }
        });


        button = (Button) findViewById(R.id.buttonCaise);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCaiseActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonCartof);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCartofActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonCascaval);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCascavalActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonCastraveti);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCastravetiActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonFulgiDeOvaz);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFulgiDeOvazActivity();
            }
        });


        button = (Button) findViewById(R.id.buttonLapte);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLapteActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonMar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMarActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonOua);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOuaActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonSpanac);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpanacActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonUsturoi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUsturoiActivity();
            }
        });


        button = (Button) findViewById(R.id.buttonVitaGrasa);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVitaGrasaActivity();
            }
        });


    }





    public void openBananaActivity () {
        Intent intent = new Intent(AlimenteActivity.this, BananaActivity.class);
        startActivity(intent);
    }


    public void openCaiseActivity () {
        Intent intent = new Intent(AlimenteActivity.this, CaiseActivity.class);
        startActivity(intent);
    }

    public void openCartofActivity () {
        Intent intent = new Intent(AlimenteActivity.this, CartofActivity.class);
        startActivity(intent);
    }

    public void openCascavalActivity () {
        Intent intent = new Intent(AlimenteActivity.this, CascavalActivity.class);
        startActivity(intent);
    }

    public void openFulgiDeOvazActivity () {
        Intent intent = new Intent(AlimenteActivity.this, FulgiDeOvazActivity.class);
        startActivity(intent);
    }

    public void openLapteActivity () {
        Intent intent = new Intent(AlimenteActivity.this, LapteActivity.class);
        startActivity(intent);
    }

    public void openMarActivity () {
        Intent intent = new Intent(AlimenteActivity.this, MarActivity.class);
        startActivity(intent);
    }

    public void openOuaActivity () {
        Intent intent = new Intent(AlimenteActivity.this, OuaActivity.class);
        startActivity(intent);
    }

    public void openSpanacActivity () {
        Intent intent = new Intent(AlimenteActivity.this, SpanacActivity.class);
        startActivity(intent);
    }

    public void openUsturoiActivity () {
        Intent intent = new Intent(AlimenteActivity.this, UsturoiActivity.class);
        startActivity(intent);
    }

    public void openVitaGrasaActivity () {
        Intent intent = new Intent(AlimenteActivity.this, VitaGrasaActivity.class);
        startActivity(intent);
    }

    public void openCastravetiActivity () {
        Intent intent = new Intent(AlimenteActivity.this, CastravetiActivity.class);
        startActivity(intent);
    }


}
