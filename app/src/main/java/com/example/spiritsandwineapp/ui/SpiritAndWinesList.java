package com.example.spiritsandwineapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.spiritsandwineapp.R;
import com.example.spiritsandwineapp.models.Brew;
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
    //@BindView(R.id.progressBar)
    //ProgressBar mProgressBar;
   // @BindView(R.id.errorTextView)
    //TextView mErrorTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spirit_and_wines);
        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, drinks);
        mDrinksListView.setAdapter(adapter);
        PunkApi client = PunkClient.getClient();
        Call<ArrayList<Brew>> call = client.getBeers();
        call.enqueue(new Callback<ArrayList<Brew>>() {
            @Override
            public void onResponse(Call<ArrayList<Brew>> call, Response<ArrayList<Brew>> response) {
                Log.d(TAG, "onResponse: successful");
            }

            @Override
            public void onFailure(Call<ArrayList<Brew>> call, Throwable t) {

            }
        });

    }
}