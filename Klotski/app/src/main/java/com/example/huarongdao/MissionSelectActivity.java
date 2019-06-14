package com.example.huarongdao;


import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MissionSelectActivity extends AppCompatActivity{

    private RelativeLayout mission;
    private RecyclerView mRecyclerView;
    private Mission_List mAdapter;
    private RelativeLayout container;

    private SeekBar seekbar;
    private TextView current_time;
    private TextView total_time;
    private TextView music_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_select);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        SharedPreferences read = getSharedPreferences("map", MODE_PRIVATE);
        Mission.getFinish(read);
        mission = findViewById(R.id.mission);
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new Mission_List(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        container = findViewById(R.id.container);

    }
}
