package com.navratan.wokes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.navratan.wokes.Model.BestSellerModel;
import com.navratan.wokes.R;

import java.util.List;

public class BestSellerAdapter extends RecyclerView.Adapter<BestSellerAdapter.BSViewHolder> {

    List<BestSellerModel> bestSellerModels;

    public BestSellerAdapter(List<BestSellerModel> bestSellerModels) {
        this.bestSellerModels = bestSellerModels;
    }

    @NonNull
    @Override
    public BSViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seller_grid_layout, parent, false);
        return new BSViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BSViewHolder holder, int position) {
        BestSellerModel bestSellerModel = bestSellerModels.get(position);
        Context context = holder.itemView.getContext();
        holder.sname.setText(bestSellerModel.getShopname());
        holder.saddrs.setText(bestSellerModel.getShopaddress());
        holder.soffer.setText(bestSellerModel.getShopoffer()+" "+"%"+" "+"off");
        holder.srating.setText(bestSellerModel.getShoprating());
        Glide.with(context).load(bestSellerModel.getShopimage()).placeholder(R.drawable.hb).into(holder.simage);

    }

    @Override
    public int getItemCount() {
        return bestSellerModels.size();
    }

    public class BSViewHolder extends RecyclerView.ViewHolder {
        TextView sname, saddrs, srating, soffer;
        ImageView simage;

        public BSViewHolder(@NonNull View itemView) {
            super(itemView);
            sname = itemView.findViewById(R.id.shop_name);
            saddrs = itemView.findViewById(R.id.shop_address);
            srating = itemView.findViewById(R.id.shop_rating);
            soffer = itemView.findViewById(R.id.shop_offer);
            simage = itemView.findViewById(R.id.shop_image);
        }
    }
}
