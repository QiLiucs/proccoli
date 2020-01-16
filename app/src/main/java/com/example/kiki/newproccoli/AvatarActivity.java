package com.example.kiki.newproccoli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class AvatarActivity extends AppCompatActivity {

    private ListView listview;
    private AvatarImageAdapter avatarImageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);
        listview = findViewById(R.id.lv_avatars);
        listview.setDivider(null);
        avatarImageAdapter = new AvatarImageAdapter(this);
        listview.setAdapter(avatarImageAdapter);
    }
}
