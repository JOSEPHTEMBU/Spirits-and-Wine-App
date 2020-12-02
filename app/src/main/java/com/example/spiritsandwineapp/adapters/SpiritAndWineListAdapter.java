package com.example.spiritsandwineapp.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spiritsandwineapp.R;
import com.example.spiritsandwineapp.models.Brew;
import com.example.spiritsandwineapp.ui.SpiritAndWineDetailActivity;
import com.example.spiritsandwineapp.ui.SpiritAndWineDetailActivity_ViewBinding;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpiritAndWineListAdapter extends RecyclerView.Adapter<SpiritAndWineListAdapter.SpiritAndWineViewHolder> {
    private List<Brew> mBrews;
    private Context mContext;
    public SpiritAndWineListAdapter(Context context, List<Brew> brews) {
        mContext = context;
        mBrews = brews;
    }

    @NonNull
    @Override
    public SpiritAndWineListAdapter.SpiritAndWineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.spirit_and_wines_list_item, parent, false);
        SpiritAndWineViewHolder viewHolder = new SpiritAndWineViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SpiritAndWineListAdapter.SpiritAndWineViewHolder holder, int position) {
        holder.bindBrew(mBrews.get(position));

    }

    @Override
    public int getItemCount() {
        return mBrews.size();
    }


    public class SpiritAndWineViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @SuppressLint("NonConstantResourceId")
        @BindView(R.id.spiritsAndWineImageView)
        ImageView mSpiritsAndWineImageView;
        @SuppressLint("NonConstantResourceId")
        @BindView(R.id.spiritsAndWineName)
        TextView mNameTextView;
        @SuppressLint("NonConstantResourceId")
        @BindView(R.id.firstBrewed) TextView mDateBrewed;
        @SuppressLint("NonConstantResourceId")
        @BindView(R.id.phTextView) TextView mPhTextView;
        private final Context mContext;



        public SpiritAndWineViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        public void bindBrew(Brew brew) {
            mNameTextView.setText(brew.getName());
            mDateBrewed.setText(brew.getFirstBrewed());

            if(brew.getPh() == null){
                mPhTextView.setText("N/A");
            }else{
                mPhTextView.setText(brew.getPh().toString());
            }
            Picasso.get().load(brew.getImageUrl()).into(mSpiritsAndWineImageView);

        }
        @Override
        public void onClick(View v) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, SpiritAndWineDetailActivity.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("brews", Parcels.wrap(mBrews));
           mContext.startActivity(intent);
        }
    }
}