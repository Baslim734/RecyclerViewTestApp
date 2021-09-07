package com.example.recyclerviewtestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView numberList;
    private NumbersAdapter numbersAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberList = findViewById(R.id.recycler_view_numbers);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        numberList.setLayoutManager(layoutManager);

        numberList.setHasFixedSize(true);

        numbersAdapter = new NumbersAdapter(100, this);
        numberList.setAdapter(numbersAdapter);
    }
}