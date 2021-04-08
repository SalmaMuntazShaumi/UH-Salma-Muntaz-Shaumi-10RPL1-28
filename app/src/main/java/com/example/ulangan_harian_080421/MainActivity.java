package com.example.ulangan_harian_080421;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ELearnAdapter Adapter;
    private ArrayList<ELearn> ELearnArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        Adapter = new ELearnAdapter(ELearnArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(Adapter);
    }

    void addData(){
        ELearnArrayList = new ArrayList<>();
        ELearnArrayList.add(new ELearn("Bahasa Inggris", "Jumlah E-Learning : 2"));
        ELearnArrayList.add(new ELearn("Sejarah", "Jumlah E-Learning : 5"));
        ELearnArrayList.add(new ELearn("Fisika", "Jumlah E-Learning : 0"));
        ELearnArrayList.add(new ELearn("Matematika", "Jumlah E-Learning : 10"));
    }

}