package dev.edmt.tedrecku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class SleepActivity extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);


        textView = (TextView) findViewById(R.id.textViewSleep);
        textView.setMovementMethod(new ScrollingMovementMethod());



    }
}
