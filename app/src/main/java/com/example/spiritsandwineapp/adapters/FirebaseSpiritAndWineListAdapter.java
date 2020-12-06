//package com.example.spiritsandwineapp.adapters;
//
//import com.firebase.ui.database.FirebaseRecyclerAdapter;
//
//public class FirebaseSpiritAndWineListAdapter<ItemTouchHelperAdapter, FirebaseSpiritAndWineViewHolder, SpiritAndWine> extends FirebaseRecyclerAdapter<SpiritAndWine, FirebaseSpiritAndWineViewHolder> implements ItemTouchHelperAdapter {
//
//
//    @Override
//    public boolean onItemMove(int fromPosition, int toPosition) {
//        notifyItemMoved(fromPosition, toPosition);
//        return false;
//    }
//
//    @Override
//    public void onItemDismiss(int position) {
//        getRef(position).removeValue();
//
//
//    }
//
//}