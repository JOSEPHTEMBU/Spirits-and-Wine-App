package com.example.spiritsandwineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpiritsAndWines extends AppCompatActivity {

    String[] drinks = {"Champagne","Zinfandel. White wine. Chardonnay. Pinot grigio. Riesling. Moscato", " rum","tequila","baijiu","Amarula","White Walker", "Vodka","shōchū","shōchū"};
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.loggedInAs)
    TextView mLoggedInAsTextView;

    @BindView(R.id.drinkListView)
    ListView mDrinksListView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spirits_and_wines);
        ButterKnife.bind(this);

        String email = getIntent().getStringExtra("email");
        mLoggedInAsTextView.setText("Logged in with email: " + email);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, drinks);
        mDrinksListView.setAdapter(adapter);

    }
}