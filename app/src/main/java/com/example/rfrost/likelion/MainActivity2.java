package com.example.rfrost.likelion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rfrost on 2015. 9. 13..
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.seungyun2);
        images.add(R.drawable.seungyun2);
        images.add(R.drawable.seungyun2);
        images.add(R.drawable.seungyun2);

        List<String> names = new ArrayList<>();
        names.add("레이디제인");
        names.add("한승연");
        names.add("에이핑크");
        names.add("여자친구");

        MainListAdapter adapter = new MainListAdapter(this, images, names);

        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
