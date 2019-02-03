package th.ac.su.ict.chanokpattarin.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button colorOne;
    private Button colorTwo;
    private Button colorThree;
    private Button colorFour;
    private Button colorFive;
    private Button colorSix;
    private TextView showColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorOne = findViewById(R.id.colorOne);
        colorTwo = findViewById(R.id.colorTwo);
        colorThree = findViewById(R.id.colorThree);
        colorFour = findViewById(R.id.colorFour);
        colorFive = findViewById(R.id.colorFive);
        colorSix = findViewById(R.id.colorSix);
        showColor = findViewById(R.id.showColor);

        colorOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColor.setBackgroundColor(0xFFEBFFDD);
                showColor.setText("235-226-221");
            }
        });

        colorTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColor.setBackgroundColor(0xFFEBCBCA);
                showColor.setText("236-225-219");
            }
        });

        colorThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColor.setBackgroundColor(0xFF7E93B2);
                showColor.setText("117-131-157");
            }
        });

        colorFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColor.setBackgroundColor(0xFF71A1C6);
                showColor.setText("153-169-192");
            }
        });

        colorFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColor.setBackgroundColor(0xFFC3CCD8);
                showColor.setText("195-204-214");
            }
        });

        colorSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColor.setBackgroundColor(0xFFE0F7FF);
                showColor.setText("221-226-229");
            }
        });

    }

}
