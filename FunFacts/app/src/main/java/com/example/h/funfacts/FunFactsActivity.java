package com.example.h.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    public static final String  TAG = FunFactsActivity.class.getSimpleName();
    private ColorWheel          colorWheel = new ColorWheel();
    private FactBook            factBook = new FactBook();
    private TextView            factTextView;
    private Button              showFactButton;
    private RelativeLayout      relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the Views form the layout file to the corresponding variables
        factTextView = (TextView) findViewById(R.id.textView);
        showFactButton = (Button) findViewById(R.id.showFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.rLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //update the string text with new fact
                factTextView.setText(factBook.getFact());
                relativeLayout.setBackgroundColor(colorWheel.getColor());
                showFactButton.setTextColor(colorWheel.getColor());
            }
        };
        showFactButton.setOnClickListener(listener);
        //Toast.makeText(this, "Toast: activity created.", Toast.LENGTH_LONG).show();

        Log.d(TAG, "We're logging from the onCreate() method!");
    }
}
