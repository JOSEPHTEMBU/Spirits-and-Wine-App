package com.example.spiritsandwineapp.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.spiritsandwineapp.Constants;
import com.example.spiritsandwineapp.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SavedSpiritAndWineActivity<FirebasespiritsandwineViewHolder extends RecyclerView.ViewHolder, spiritsAndwine> extends AppCompatActivity {
    private DatabaseReference mSpiritsandwineReference;
    private FirebaseRecyclerAdapter<spiritsAndwine, FirebasespiritsandwineViewHolder> mFirebaseAdapter;
    @BindView(R.id.savedRecyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.spiritsandwineNameTextView)
    TextView mSpiritsandwineTextviewl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Slidr.attach(this);
        setContentView(R.layout.activity_saved_spirit_and_wine);
        ButterKnife.bind(this);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        String uid = user.getUid();
        mSpiritsandwineReference = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_SpiritsAndWine).child(uid);


        mSpiritsandwineReference = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_SPiritsAndWine);
        setUpFirebaseAdapter();

    }

    private <SpiritsAndWine, FirebaseTeamViewHolder> void setUpFirebaseAdapter() {
        FirebaseRecyclerOptions<SpiritsAndWine> options =
                new FirebaseRecyclerOptions.Builder<SpiritsAndWine>()
                       // .setQuery(mSpiritsandwineReference, SpiritsAndWine.class)
                        .build();

       // mFirebaseAdapter = new FirebaseRecyclerAdapter<SpiritsAndWine, FirebaseTeamViewHolder>(options) {
            //@Override
           // protected void onBindViewHolder(@NonNull FirebaseTeamViewHolder firebaseTeamViewHolder, int position, @NonNull SpiritAndWine) {
            //    firebaseTeamViewHolder.bindSpiritsAndWine(team);
            }


        };

        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //mRecyclerView.setAdapter(mFirebaseAdapter);




