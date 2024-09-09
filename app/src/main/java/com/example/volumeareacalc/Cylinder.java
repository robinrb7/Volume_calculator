package com.example.volumeareacalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cylinder extends AppCompatActivity {
    TextView result,title;
    EditText cylinderRadius,cylinderHeight;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cylinder);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        result = findViewById(R.id.textView2);
        title = findViewById(R.id.textView);
        cylinderRadius = findViewById(R.id.cylinderRadius);
        cylinderHeight = findViewById(R.id.cylinderHeight);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cylinderRadius.getText().toString();
                int r = Integer.parseInt(radius);
                String height = cylinderHeight.getText().toString();
                int h = Integer.parseInt(height);

                double volume = ((double) 3.14159 * (r*r) * h) ;

                result.setText("Volume = "+volume+" m^3");
            }
        });
    }
}