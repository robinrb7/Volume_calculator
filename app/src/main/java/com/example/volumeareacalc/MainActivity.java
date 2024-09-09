package com.example.volumeareacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Shape> shapeArrayList;
    myCutsomAdpater adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);
        shapeArrayList = new ArrayList<>();
        Shape s1 = new Shape("Cylinder",R.drawable.img);
        Shape s2 = new Shape("Sphere",R.drawable.img_1);
        Shape s3 = new Shape("Cube",R.drawable.img_2);
        Shape s4 = new Shape("Prism",R.drawable.img_6);

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter = new myCutsomAdpater(shapeArrayList,getApplicationContext());
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
                switch (position) {
                    case 0: // Cylinder
                        i = new Intent(getApplicationContext(), Cylinder.class);
                        break;
                    case 1: // Sphere
                        i = new Intent(getApplicationContext(), Sphere.class);
                        break;
                    case 2: // Cube
                        i = new Intent(getApplicationContext(), Cube.class);
                        break;
                    case 3: // Prism
                        i = new Intent(getApplicationContext(), Prism.class);
                        break;
                    default:
                        i = new Intent(getApplicationContext(), MainActivity.class);
                        break;
                }
                startActivity(i);
            }
        });


    }
}