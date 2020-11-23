package com.example.spiritsandwineapp.adapters;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

public class SpiritandWineListAdapter extends RecyclerView.Adapter<SpiritandWineListAdapter.SpiritandWineViewHolder> {
    private List<Business> mRestaurants;
    private Context mContext;

    public RestaurantListAdapter(Context context, List<Business> restaurants) {
        mContext = context;
        mRestaurants = restaurants;
    }
}