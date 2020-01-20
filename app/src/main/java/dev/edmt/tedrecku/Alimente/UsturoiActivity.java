package dev.edmt.tedrecku.Alimente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import dev.edmt.tedrecku.R;

public class UsturoiActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usturoi);

        textView = (TextView) findViewById(R.id.textViewDescriere);

        String DescriereCartof ="Beneficiile sale sunt intr-adevar multe, chiar dacă multi evita sa il manance, deoarece se tem de efectele sale asupra respiratiei. Aceasta problema poate fi depasita cu usurinta, deoarece exista multe modalitati de a elimina mirosul de usturoi din gura, sunt remedii simple, cum ar fi mestecarea unei frunze de busuioc sau bautul de suc de lamaie, pentru a manca usturoiul crud in pace. Sa vedem care sunt toate beneficiile sale.\n" +
                "\n" +
                "Beneficiile usturoiului crud\n" +
                "Previne cancerul pulmonar: o cercetarea efectuata in China a demonstrat ca mancand-ul crud de doua ori pe saptamana poate reduce riscul de cancer pulmonar la jumatate. Cei care consuma in mod regulat usturoi crud au o probabilitate de 44% mai mica de a a face o tumoare, iar acest lucru ar functiona si pentru fumatori, reducand riscul, in acest caz cu 30%. Usturoiul crud ar impiedica, de asemenea, cancerul intestinal.\n" +
                "\n" +
                "Antibiotic naturale: usturoiul crud este unul dintre cele mai eficiente antibiotice naturale, ajuta la combaterea virusilor, bacteriilor si ciupercilor datorita actiunii puternice a alicinei, care ii confera, de asemenea, proprietati antibacteriene.\n" +
                "\n" +
                "Antioxidant: alicina continuta in usturoiul crud il face de asemenea un puternic antioxidant capabil sa combata efectele daunatoare ale radicalilor liberi prevenind imbatranirea.\n" +
                "\n" +
                "Reduce tensiunea arteriala si mentine colesterolul sub control: usturoiul crud are efecte benefice asupra circulatiei, asupra sistemului cardiovascular, ajutand astfel chiar si in caz de hipertensiune arteriala, precum si reducerea colesterolului rau din sange.\n" +
                "\n" +
                "Ajuta la digestie si este benefic pentru ficat si vezica: consumul de usturoi proaspat favorizeaza digestia si regleaza flora intestinala. Chiar si ficatul si vezica urinara pot beneficia de proprietatile sale purificante și antibacteriene.\n" +
                "\n" +
                "Combate bolile sezoniere: usturoiul crud este un remediu excelent pentru intarirea sistemului imunitar, de fapt ajuta la lupta impotriva racelii si a gripei.\n" +
                "\n" +
                "Pentru a consuma usturoiul crud in perioada postului, taiati catelul pe jumatate, lasati-l sa se odihneasca timp de 10-15 minute si apoi inghititi-l cu putina apa. Cantitatea recomandata este de un catel de doua ori pe saptamana pentru a beneficia de toate proprietatile sale.\n" +
                "\n" +
                "Contraindicatii\n" +
                "Consumul de usturoi crud este bun, dar este mai bine sa nu exagerati, deoarece pot aparea unele efecte secundare, cum ar fi iritarea peretilor intestinali si a tractului digestiv. Usturoiul crud nu este recomandat in caz de gastrita, ulcer peptic, anemie si chiar subiectilor alergici. De asemenea, ar putea interactiona cu unele medicamente, in special cu anticoagulante.";

        textView.setText(DescriereCartof);

        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
