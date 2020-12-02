package com.example.spiritsandwineapp.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.spiritsandwineapp.R;
import com.example.spiritsandwineapp.adapters.SpiritAndWineListAdapter;
import com.example.spiritsandwineapp.models.Brew;
import com.example.spiritsandwineapp.network.PunkApi;
import com.example.spiritsandwineapp.network.PunkClient;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SpiritAndWinesList extends AppCompatActivity {
//    private static final String TAG = " ";
//    String[] drinks = {"Champagne", " rum", "tequila", "baijiu", "Amarula", "White Walker", "Vodka", "shōchū", "shōchū"};
//    @BindView(R.id.drinkListView)
//    ListView mDrinksListView;
//    @BindView(R.id.errorTextView) TextView mErrorTextView;
//    @BindView(R.id.progressBar) ProgressBar mProgressBar;
//    //@BindView(R.id.progressBar)
//    //ProgressBar mProgressBar;
//   // @BindView(R.id.errorTextView)
//    //TextView mErrorTextView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_spirit_and_wines);
//        ButterKnife.bind(this);
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, drinks);
//       // Toast.makeText(SpiritAndWinesActivity.this, brew, Toast.LENGTH_LONG).show();
//        mDrinksListView.setAdapter(adapter);
//        PunkApi client = PunkClient.getClient();
//        Call<ArrayList<Brew>> call = client.getBeers();
//        call.enqueue(new Callback<ArrayList<Brew>>() {
//
//            Intent intent = getIntent();
//            //String location = intent.getStringExtra("location");
//       // mBrewTextView.setText("Here are all the restaurants near: " + Brew);
//
//           // PunkApi client = PunkApi.getClient();
//
//           // Call<PunkApiBrewSearchResponse> call = client.getBeers();
//
//
//            @Override
//            public void onResponse(Call<ArrayList<Brew>> call, Response<ArrayList<Brew>> response) {
//                Log.d(TAG, "onResponse: successful");
//
//
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<Brew>> call, Throwable t) {
//
//            }
//        });
//
//    }

//    private TextView mErrorTextView;

    @BindView(R.id.errorTextView)
     TextView mErrorTextView;

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;


//    private RecyclerView mRecyclerView;

//    private ProgressBar mProgressBar;


    private SpiritAndWineListAdapter mAdapter;

    public List<Brew> brews;

    private static final String TAG = SpiritAndWinesList.class.getSimpleName();

    PunkApi client = PunkClient.getClient();

    Call<ArrayList<Brew>> call = client.getBeers();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spirit_and_wines);
        ButterKnife.bind(this);
//        mProgressBar = (ProgressBar) .findViewById(R.id.progressBar);
//
//        mErrorTextView = (TextView) view.findViewById(R.id.errorTextView);
//
//        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);


        call.enqueue(new Callback<ArrayList<Brew>>() {

            @Override
            public void onResponse(Call<ArrayList<Brew>> call, Response<ArrayList<Brew>>response) {

                hideProgressBar();

                if (response.isSuccessful()) {

                    brews = (List<Brew>) response.body();
                    mAdapter = new SpiritAndWineListAdapter(SpiritAndWinesList.this, brews);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager =
                            new LinearLayoutManager(SpiritAndWinesList.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);

                    showTeams();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Brew>> call, Throwable t) {
                Log.e(TAG, "onFailure: ",t );
                hideProgressBar();
                showFailureMessage();
            }
        });

    }

    @SuppressLint("SetTextI18n")
    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    @SuppressLint("SetTextI18n")
    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showTeams() {
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }
}