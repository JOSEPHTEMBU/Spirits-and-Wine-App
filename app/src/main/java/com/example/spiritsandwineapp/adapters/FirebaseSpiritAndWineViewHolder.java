//package com.example.spiritsandwineapp.adapters;
//
//import android.content.Intent;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.spiritsandwineapp.Constants;
//import com.example.spiritsandwineapp.R;
//import com.example.spiritsandwineapp.SpiritandWineDetailActivity;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//import com.squareup.picasso.Picasso;
//
//import org.parceler.Parcels;
//
//import java.util.ArrayList;
//
//public class FirebaseSpititsAndWineViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//
//    View mView;
//    Context mContext;
//
//    public FirebaseRestaurantViewHolder(View itemView) {
//        super(itemView);
//        mView = itemView;
//        mContext = itemView.getContext();
//        itemView.setOnClickListener(this);
//    }
//
//    public void bindSpiritsAndWine( SpiritsAndWine) {
//        ImageView restaurantImageView = (ImageView) mView.findViewById(R.id.brewImageView);
//        TextView nameTextView = (TextView) mView.findViewById(R.id.firstBrewedNameTextView);
//
//
//        Picasso.get().load(brew.getImageUrl()).into(SpiritsImageView);
//
//        nameTextView.setText(brew.getName());
//
//    }
//
//    @Override
//    public void onClick(View view) {
//        final ArrayList<brew> SpiritsAndWine = new ArrayList<>();
//        DatabaseReference ref = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_SPIRITSANDWINE);
//        ref.addListenerForSingleValueEvent(new ValueEventListener() {
//
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                    brew.add(snapshot.getValue(brew.class));
//                }
//
//                int itemPosition = getLayoutPosition();
//
//                Intent intent = new Intent(mContext, SpiritandWineDetailActivity.class);
//                intent.putExtra("position", itemPosition + "");
//                intent.putExtra("brew", Parcels.wrap(brew));
//
//                mContext.startActivity(intent);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//            }
//        });
//    }
//}