package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class detail_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);

        Intent it = new Intent();

        TextView txtName = (TextView) findViewById(R.id.textView6);
        TextView txtdescription = (TextView) findViewById(R.id.textView7);
        TextView txtprice = (TextView) findViewById(R.id.textView13);
        ImageView img = (ImageView) findViewById(R.id.imageView);



        txtName.setText(String.valueOf(getIntent().getExtras().getString("name")));
        txtdescription.setText(String.valueOf(getIntent().getExtras().getString("dep")));
        txtprice.setText(String.valueOf(getIntent().getExtras().getString("price")));
        img.setImageResource(Integer.valueOf(getIntent().getExtras().getInt("id")));

    }
}