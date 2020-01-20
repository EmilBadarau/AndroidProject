package dev.edmt.tedrecku.Alimente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import dev.edmt.tedrecku.R;

public class BananaActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana);

        textView = (TextView) findViewById(R.id.textViewDescriere);

        String DescriereCartof ="Pulpa bananei, desi considerata calorica, este bogata in apa, aproximativ 70% din greutate, 20% carbohidrati si 3% proteine, grasimi si fibre alimentare. Banana este bogata in special in potasiu: 100 g fac deja 20% din necesarul zilnic al unui adult. Alte saruri minerale prezente in cantitati discrete sunt fosforul si fierul. Consumul regulat de banane ajuta la garantarea aportului corect de vitamine. Pulpa de banane contine  vitaminele A, B1, B2, B6, C si PP. \nBananele au fost de asemenea definite ca fructe cu proprietati calmante: aceasta activitate depinde de cantitatea discreta de vitamina B6 si piridoxina, pe care le contin. B6 este necesara pentru sinteza serotoninei, un neurotransmitator care, prin actiunea sa, este cunoscut si ca “hormonul fericirii“. \nCum si cand sa mancati banane \nBanana este un fruct care se prepara in multe feluri si exista diferite modalitati de a va bucura de ea si de avantajele sale. Fructul proaspat este, fara indoiala, cel mai consumat si pentru faptul ca este foarte comod ca o gustare pe care sa o luati la birou sau la scoala. Feliile de banane uscate sau reduse in faina devin un ingredient tot mai comun in industria dulciurilor. Banana uscata, precum si musli, sunt ingrediente comune pentru micul dejun. \nBanana poate fi consumata si coapta: este, de asemenea, potrivita pentru prepararea gemurilor. In bucataria vegana sau cei care nu tolereaza ouale, pulpa de banane zdrobita este folosita ca o alternativa a oului pentru prepararea deserturilor. \nBanana, diabetul si glicemia mare. \nBananele sunt fructe bogate in zaharuri, chiar simple: aproximativ 15 g pe portie. Prin urmare, consumul lor nu este potrivit pentru cei care sufera de diabet. Banana este un fruct cu un indice glicemic ridicat, precum si mandarinele, kaki, smochinele si strugurii: toate aceste fructe ar trebui evitate sau, in orice caz, consumul acestora ar trebui sa fie doar ocazional pentru cei care sufera de diabet.";

        textView.setText(DescriereCartof);

        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
