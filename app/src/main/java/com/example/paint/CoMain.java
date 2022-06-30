package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

    //页面数据
    public class CoMain extends AppCompatActivity {

        private RecyclerView recyclerView;
        private List<Beauty> data = new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.commitary);
            recyclerView = (RecyclerView) findViewById(R.id.list);
            StaggeredGridLayoutManager recyclerViewLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

            recyclerView.setLayoutManager(recyclerViewLayoutManager);
            initData();

            BeautyAdapter adapter = new BeautyAdapter(data, this);

            recyclerView.setAdapter(adapter);
        }


    public void  initData(){
        Beauty beauty;
        //初始化页面数据
        for (int i = 0;i<5;i++) {
            beauty = new Beauty("1", R.drawable.s1);
            data.add(beauty);
            beauty = new Beauty("2", R.drawable.s2);
            data.add(beauty);
            beauty = new Beauty("3", R.drawable.s3);
            data.add(beauty);
            beauty = new Beauty("4", R.drawable.s4);
            data.add(beauty);

        }}}

