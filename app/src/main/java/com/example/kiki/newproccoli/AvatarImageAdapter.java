package com.example.kiki.newproccoli;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class AvatarImageAdapter extends BaseAdapter {
    private final int n = 18 / 3;
    private Activity activity;

    public AvatarImageAdapter(Activity activity){
        this.activity = activity;
    }
    @Override
    public int getCount() {
        return n;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.adapter_images, parent, false);
        }
        ImageView leftImg = convertView.findViewById(R.id.iv_left);
        ImageView centerImg = convertView.findViewById(R.id.iv_center);
        ImageView rightImg = convertView.findViewById(R.id.iv_right);
        ImageView[] ivs = new ImageView[]{
                leftImg,
                centerImg,
                rightImg
        };
        for(int i = 0; i < 3; i++){
            int id = this.activity.getResources().getIdentifier("light"+(position*3 + i), "drawable", this.activity.getPackageName());
            ivs[i].setImageResource(id);
        }

        return convertView;
    }
}
