package com.example.spiritsandwineapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.spiritsandwineapp.R;
import com.example.spiritsandwineapp.models.Brew;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpiritsAndWineDetailsFragment extends Fragment {

    @BindView(R.id.spiritsandwineImageView)
    ImageView mImageLabel;
    @BindView(R.id.spiritsandwineNameTextView)
    TextView mNameLabel;

    @BindView(R.id.pHTextView) TextView mPhTextView;
    @BindView(R.id.firstBrewedTextView) TextView mFirstBrewedTextView;
//    @BindView(R.id.phoneTextView) TextView mPhoneLabel;
//    @BindView(R.id.addressTextView) TextView mAddressLabel;
//    @BindView(R.id.saveBrewButton) TextView mSaveBrewButton;

    private Brew mBrew;

    public SpiritsAndWineDetailsFragment() {
        // Required empty public constructor
    }

    public static SpiritsAndWineDetailsFragment newInstance(Brew brew){
        SpiritsAndWineDetailsFragment SpiritsAndWineDetailsFragment = new SpiritsAndWineDetailsFragment();
        Bundle args = new Bundle();
        args.putParcelable("brew", Parcels.wrap(brew));
        SpiritsAndWineDetailsFragment.setArguments(args);
        return SpiritsAndWineDetailsFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mBrew = Parcels.unwrap(getArguments().getParcelable("brew"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail_spirit_and_wine, container, false);
        ButterKnife.bind(this, view);
        Picasso.get().load(mBrew.getImageUrl()).into(mImageLabel);
        mNameLabel.setText(mBrew.getName());
        mFirstBrewedTextView.setText("First Brewed: "+mBrew.getFirstBrewed());
        mPhTextView.setText("PH: "+mBrew.getPh().toString());
//        mPhoneLabel.setText(mBrew.getPhone());
//        mAddressLabel.setText(android.text.TextUtils.join(", ", mBrew.getAddress()));
        return view;
    }

}


