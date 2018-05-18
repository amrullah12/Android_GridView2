package com.example.dell.grid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by DELL on 17/05/2018.
 */

public class ImageAdapter extends BaseAdapter {

    private Context context;
    public Integer[] images = {
            R.drawable.cii, R.drawable.ciii,
            R.drawable.cir, R.drawable.cirr,
            R.drawable.kiii, R.drawable.images,
            R.drawable.kot, R.drawable.kuuu,
            R.drawable.lii, R.drawable.pot

    };
    public  ImageAdapter(Context c){
        context = c;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240, 240));
        return imageView;
    }
}
