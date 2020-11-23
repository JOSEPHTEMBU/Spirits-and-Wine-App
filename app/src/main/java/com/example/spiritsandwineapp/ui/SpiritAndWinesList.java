package com.example.spiritsandwineapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.spiritsandwineapp.MainDatum;
import com.example.spiritsandwineapp.R;
import com.example.spiritsandwineapp.network.PunkApi;
import com.example.spiritsandwineapp.network.PunkClient;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SpiritAndWinesList extends AppCompatActivity {
    private static final String TAG = " ";
    String[] drinks = {"Champagne", " rum", "tequila", "baijiu", "Amarula", "White Walker", "Vodka", "shōchū", "shōchū"};
    @BindView(R.id.drinkListView)
    ListView mDrinksListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spirit_and_wines);
        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, drinks);
        mDrinksListView.setAdapter(adapter);
        PunkApi client = PunkClient.getClient();
        Call<ArrayList<MainDatum>> call = client.getBeers();
        call.enqueue(new Callback<ArrayList<MainDatum>>() {
            @Override
            public void onResponse(Call<ArrayList<MainDatum>> call, Response<ArrayList<MainDatum>> response) {
                Log.d(TAG, "onResponse: successful");
            }

            @Override
            public void onFailure(Call<ArrayList<MainDatum>> call, Throwable t) {
            }
        });
    }
}