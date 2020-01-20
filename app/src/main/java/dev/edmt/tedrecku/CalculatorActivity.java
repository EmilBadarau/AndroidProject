package dev.edmt.tedrecku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CalculatorActivity extends AppCompatActivity {

    Button button1, button2;
    TextView viewActivitate, viewFinal, viewAlegere, viewFinalCalculator;
    EditText number1;
    Button Calculeaza;

    float result_num;
    int num1 = 0, activitate = 0, alegere = 0;
    String activitatea, alegerea;

    public void setButton1(Button button1) {
        this.button1 = button1;
    }

    public void setButton2(Button button2) {
        this.button2 = button2;
    }

    public void setViewAlegere(TextView viewAlegere) {
        this.viewAlegere = viewAlegere;
    }

    public void setNumber1(EditText number1) {
        this.number1 = number1;
    }

    public void setCalculeaza(Button calculeaza) {
        Calculeaza = calculeaza;
    }

    public void setResult_num(float result_num) {
        this.result_num = result_num;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }



    public void setActivitate(int activitate) {
        this.activitate = activitate;
    }

    public void setActivitatea(String activitatea) {
        this.activitatea = activitatea;
    }

    public void setAlegerea(String alegerea) {
        this.alegerea = alegerea;
    }


    public void setViewActivitate(TextView viewActivitate) {
        this.viewActivitate = viewActivitate;
    }

    public void setViewFinal(TextView viewFinal) {
        this.viewFinal = viewFinal;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        viewFinal = (TextView) findViewById(R.id.textViewFinalCalculator);
        viewActivitate = (TextView) findViewById(R.id.textViewActivitate);
        viewAlegere =(TextView) findViewById(R.id.textViewAlegere);
        viewFinalCalculator = (TextView) findViewById((R.id.textViewFinalCalculator));




        number1 = (EditText) findViewById(R.id.number1);
        button1 = (Button) findViewById(R.id.buttonAlegere);
        button2 = (Button) findViewById(R.id.buttonCutOrBulk);

        Calculeaza = (Button) findViewById(R.id.Calculeaza);








        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu pm = new PopupMenu(CalculatorActivity.this, button1);
                pm.getMenuInflater().inflate(R.menu.popup_menu, pm.getMenu());
                pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item1) {

                        switch (item1.getItemId()){
                            case R.id.first:
                                Toast.makeText(CalculatorActivity.this,"Ati ales o activitate sedentara!", Toast.LENGTH_SHORT).show();
                                activitate = 14;
                                activitatea = "Ati ales ca aveti o activitate sedentara!";
                                viewActivitate.setText(activitatea);
                                num1 = Integer.parseInt(number1.getText().toString());

                                return true;

                            case R.id.second:
                                Toast.makeText(CalculatorActivity.this, "Ati ales ca aveti o activitate moderata!", Toast.LENGTH_SHORT ).show();
                                activitate = 15;
                                activitatea = "Ati ales ca aveti o activitate moderata!";
                                viewActivitate.setText(activitatea);
                                num1 = Integer.parseInt(number1.getText().toString());

                                return true;

                            case R.id.third:
                                Toast.makeText(CalculatorActivity.this, "Ati ales ca sunteti foarte activ!", Toast.LENGTH_SHORT).show();
                                activitate = 16;
                                activitatea = "Ati ales ca sunteti foarte activ!";
                                viewActivitate.setText(activitatea);
                                num1 = Integer.parseInt(number1.getText().toString());

                                return true;
                        }


                        return true;
                    }
                });



                pm.show();

            }
        });





        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu pm = new PopupMenu(CalculatorActivity.this, button2);
                pm.getMenuInflater().inflate(R.menu.stare_client, pm.getMenu());
                pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()){
                            case R.id.first:
                                Toast.makeText(CalculatorActivity.this,"Intretinere!", Toast.LENGTH_SHORT).show();
                                alegerea = "Ati ales ca doriti sa va intretineti!";
                                alegere = 0;
                                viewAlegere.setText(alegerea);
                                num1 = Integer.parseInt(number1.getText().toString());

                                return true;

                            case R.id.second:
                                Toast.makeText(CalculatorActivity.this, "Masa musculara!", Toast.LENGTH_SHORT ).show();
                                alegerea = "Ati ales ca doriti masa musculara!";
                                alegere = 500;
                                viewAlegere.setText(alegerea);
                                num1 = Integer.parseInt(number1.getText().toString());

                                return true;

                            case R.id.third:
                                Toast.makeText(CalculatorActivity.this, "Definire!", Toast.LENGTH_SHORT).show();
                                alegerea = "Ati ales ca doriti definire!";
                                alegere = -500;
                                viewAlegere.setText(alegerea);
                                num1 = Integer.parseInt(number1.getText().toString());

                                return true;

                        }


                        return true;
                    }
                });

                pm.show();

            }
        });



        Calculeaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //CITIREA GREUTATII CORPORALE
                num1 = Integer.parseInt(number1.getText().toString());
                //num2 = Integer.parseInt(number2.getText().toString());
                //result_num = num1+num2;
                result_num = (float) (num1*2.2*activitate+alegere);

                viewFinalCalculator.setText("Trebuie sa consumati zlinic :" + String.valueOf(result_num) + "Calorii");


            }
        });


        //if(activitate == 0 || alegere == 0 || num1 == 0 ){
       //     Calculeaza.setEnabled(false);}
       // else {
       //     Calculeaza.setEnabled(true);
       // }

    }
}



