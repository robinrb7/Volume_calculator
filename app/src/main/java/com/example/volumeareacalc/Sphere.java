package com.example.volumeareacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {
    TextView result,title;
    EditText sphereRadius;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        result = findViewById(R.id.textView2);
        title = findViewById(R.id.textView);
        sphereRadius = findViewById(R.id.editText);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = sphereRadius.getText().toString();
                int r = Integer.parseInt(radius);

                double volume = ((double) 4 /3) * 3.14159 * (r*r*r);

                result.setText("Volume = "+volume+" m^3");
            }
        });
    }
}