package com.example.volumeareacalc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myCutsomAdpater extends ArrayAdapter<Shape> {
    private ArrayList<Shape> shapesArraylist;
    Context context;

    public myCutsomAdpater( ArrayList<Shape> shapesArraylist, Context context) {
        super(context, R.layout.item_grid_layout,shapesArraylist);
        this.shapesArraylist = shapesArraylist;
        this.context = context;
    }

    private static class myViewHolder{
        TextView shapeName;
        ImageView shapeImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shapes = getItem(position);
        myViewHolder holder;

        if(convertView == null){
            holder = new myViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_grid_layout,parent,false);

            holder.shapeName = (TextView) convertView.findViewById(R.id.textview);
            holder.shapeImage=(ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(holder);
        }
        else{
            holder = (myViewHolder) convertView.getTag();
        }
        holder.shapeName.setText(shapes.getShapeName());
        holder.shapeImage.setImageResource(shapes.getShapeImage());

        return convertView;
    }
}
