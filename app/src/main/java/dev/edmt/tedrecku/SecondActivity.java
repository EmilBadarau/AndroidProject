package dev.edmt.tedrecku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import dev.edmt.tedrecku.Alimente.CartofActivity;

public class SecondActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);





        //textView.setMovementMethod(new ScrollingMovementMethod());

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCartofActivity();
            }
        });


        button = (Button) findViewById(R.id.buttonAlimente);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlimenteActivity();
            }
        });


        button = (Button) findViewById(R.id.buttonDiete);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDietsActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonCalculator);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalculatorActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonTraining);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrainingActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonPhotos);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhotosActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonSleep);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSleepActivity();
            }
        });


        button = (Button) findViewById(R.id.buttonDespreMine);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDespreMineActivity();
            }
        });











    }


    public void openCartofActivity () {
        Intent intent = new Intent(SecondActivity.this, CartofActivity.class);
        startActivity(intent);
    }



    public void openCalculatorActivity () {
        Intent intent = new Intent(SecondActivity.this, CalculatorActivity.class);
        startActivity(intent);
    }


    public void openDietsActivity () {
        Intent intent = new Intent(SecondActivity.this, DietsActivity.class);
        startActivity(intent);
    }

    public void openDespreMineActivity () {
        Intent intent = new Intent(SecondActivity.this, DespreMineActivity.class);
        startActivity(intent);
    }

    public void openPhotosActivity () {
        Intent intent = new Intent(SecondActivity.this, PhotosActivity.class);
        startActivity(intent);
    }

    public void openAlimenteActivity () {
        Intent intent = new Intent(SecondActivity.this, AlimenteActivity.class);
        startActivity(intent);
    }

    public void openSleepActivity () {
        Intent intent = new Intent(SecondActivity.this, SleepActivity.class);
        startActivity(intent);
    }

    public void openTrainingActivity () {
        Intent intent = new Intent(SecondActivity.this, TrainingActivity.class);
        startActivity(intent);
    }
}
