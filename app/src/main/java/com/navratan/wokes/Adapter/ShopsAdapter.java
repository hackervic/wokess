package com.navratan.wokes.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.navratan.wokes.Model.ShopsModel;
import com.navratan.wokes.ProductsActivity;
import com.navratan.wokes.R;
import com.navratan.wokes.ShopListActivity;

import java.util.List;

public class ShopsAdapter extends RecyclerView.Adapter<ShopsAdapter.ShopsViewHolder> {

    List<ShopsModel> shopsModelList;

    public ShopsAdapter(List<ShopsModel> shopsModelList) {
        this.shopsModelList = shopsModelList;
    }

    @NonNull
    @Override
    public ShopsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shops, parent, false);
        return new ShopsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopsViewHolder holder, int position) {
        ShopsModel shopsModel = shopsModelList.get(position);
        final Context context = holder.itemView.getContext();

        String str = shopsModel.getShop_status();
        if(str.equals("Open") || str.equals("open")){
            int colour = Color.parseColor("#07bf1a");
            holder.shop_status.setTextColor(colour);
        }
        else if(str.equals("Close") || str.equals("close")){
            int colour2 = Color.parseColor("#ff7b7b");
            holder.shop_status.setTextColor(colour2);
        }
        holder.shop_name.setText(shopsModel.getShop_name());
        holder.shop_status.setText(shopsModel.getShop_status());
        holder.shop_address.setText(shopsModel.getShop_address());
        Glide.with(context).load(shopsModel.getShop_image()).placeholder(R.drawable.hb).into(holder.shop_image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, ProductsActivity.class));
            }
        });

        holder.container.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_in_animation));

    }

    @Override
    public int getItemCount() {
        return shopsModelList.size();
    }

    public class ShopsViewHolder extends RecyclerView.ViewHolder {
        TextView shop_name, shop_address, shop_status;
        ImageView shop_image;
        RelativeLayout container;
        public ShopsViewHolder(@NonNull View itemView) {
            super(itemView);
            shop_name=itemView.findViewById(R.id.shop_name);
            shop_address=itemView.findViewById(R.id.shop_address);
            shop_status=itemView.findViewById(R.id.shop_status);
            shop_image=itemView.findViewById(R.id.shop_pic);
            container=itemView.findViewById(R.id.shop_container);
        }
    }
}
