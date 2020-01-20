package dev.edmt.tedrecku.Alimente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

import dev.edmt.tedrecku.R;

public class CartofActivity extends AppCompatActivity {



    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartof);

        textView = (TextView) findViewById(R.id.textViewDescriere);

        String DescriereCartof ="Gustul cartofilor\n" +
                "Cartofii sunt de mai multe tipuri: dulci, rosii, albi, inchisi la culoare, mov, de dimensiuni mici sau alungiti. Toate aceste soiuri de cartofi au caracteristici, gust si recomandari de gatit diferite. Iata o descriere a celor mai intalnite patru tipuri de cartofi:\n" +
                "\n" +
                "Cartoful Dulce\n" +
                "\n" +
                "Gust: Cu un continut moderat de zahar, dulce, untos si savuros.\n" +
                "Textura: Umed, catifelat si usor ceros.\n" +
                "Utilitate: In salate, pasat, pentru prajire sau pentru gratar.\n" +
                "\n" +
                "Cartoful Rosu\n" +
                "\n" +
                "Gust: Cu un continut moderat de zahar, dulce.\n" +
                "Textura: Cremos si usor ceros.\n" +
                "Utilitate: In supe, in tocanite, la salate, pasat.\n" +
                "\n" +
                "Cartoful Alb\n" +
                "\n" +
                "Gust: Cu un continut redus de zahar, putin dulce.\n" +
                "Textura: Usor dens, cremos si cu invelis delicat.\n" +
                "Utilitate: In tocanite, fiert, la abur, in salate sau pentru prajit.\n" +
                "\n" +
                "Cartoful Mov\n" +
                "\n" +
                "Gust: Cu un continut redus de zahar si gust de nuca.\n" +
                "Textura: Tare, amilaceu, umed si fainos.\n" +
                "Utilitate: Pentru copt, in salate sau la gratar.\n" +
                " ";

        textView.setText(DescriereCartof);

        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
