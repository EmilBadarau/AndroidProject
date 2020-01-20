package dev.edmt.tedrecku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button Register;
    private int counter=5;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        button = (Button) findViewById(R.id.buttonShortcut);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });


        Name = (EditText)findViewById(R.id.LoginName);
        Password = (EditText)findViewById(R.id.LoginPassword);
        Info = (TextView)findViewById(R.id.TextTest);
        Login = (Button)findViewById(R.id.login);
        //Register = (Button)findViewById(R.id.register);

        Info.setText("No of attempts remaining: 5");




        button = (Button) findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });




        Login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view){

                validate(Name.getText().toString(), Password.getText().toString());

            }
        });



       // List<String> flowers = getFlowers();
       // ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, flowers);

       // Spinner spinner = findViewById(R.id.spinner);
       // spinner.setAdapter(adapter);
       // spinner.setSelection(3);

       // spinner.setOnItemSelectedListener(
       //         new AdapterView.OnItemSelectedListener() {
       //             @Override
       //             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       //                 Toast.makeText(MainActivity.this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
//
         //           }
//
        //            @Override
         //           public void onNothingSelected(AdapterView<?> adapterView) {

         //           }
         //       }

       //);


    }


    private List<String> getFlowers() {
        List<String> flowers = new ArrayList<>();
        flowers.add("Roses");
        flowers.add("Lilies");
        flowers.add("Dandelion");
        flowers.add("Carnations");
        flowers.add("SunFlower");
        flowers.add("Tulip");
        return flowers;

    }


    private void validate(String userName, String userPassword){
        if((userName.equals("emilutwww")) && (userPassword.equals("test"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        }else{

            Toast.makeText(MainActivity.this,"Nume sau parolă greșite!", Toast.LENGTH_SHORT).show();


            counter--;

            Info.setText("No of attempts remaining: " + String.valueOf(counter));

            if(counter == 0){
               Login.setEnabled(false);
            }

        }
    }

    public void openRegisterActivity () {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }


    public void openSecondActivity () {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

}
