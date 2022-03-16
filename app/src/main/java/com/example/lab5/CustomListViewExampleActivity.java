package com.example.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewExampleActivity extends AppCompatActivity {
    private List<Donut> listLanguage;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Donut(R.drawable.donut_yellow, "Tasty Donut","Spicy tasty donut family","$10"));
        listLanguage.add(new Donut(R.drawable.tasty_donut, "Pink Donut","Spicy tasty donut family","$20"));
        listLanguage.add(new Donut(R.drawable.green_donut, "Floating Donut","Spicy tasty donut family","$30"));
        listLanguage.add(new Donut(R.drawable.donut_red, "Tasty Donut","Spicy tasty donut family","$20"));

        DonutAdapter adapter = new DonutAdapter(this, R.layout.item_custom_list_view, listLanguage);
        listView.setAdapter(adapter);





    }



}
