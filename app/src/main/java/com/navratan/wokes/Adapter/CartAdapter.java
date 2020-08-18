package com.navratan.wokes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.navratan.wokes.Model.CartModel;
import com.navratan.wokes.R;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {


    List<CartModel> cartModels;

    public CartAdapter(List<CartModel> cartModels)
    {
        this.cartModels = cartModels;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_cart_product, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {

        CartModel cartModel = cartModels.get(position);
        Context context = holder.itemView.getContext();

        holder.cart_p_name.setText(cartModel.getCart_product_name());
        holder.cart_p_price.setText(cartModel.getCart_product_price());
        holder.cart_p_count.setText(cartModel.getCart_count());
        Glide.with(context).
                load(cartModel.getCart_product_image())
                .into(holder.cart_p_img);

    }

    @Override
    public int getItemCount() {
        return cartModels.size();
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder implements AdapterView.OnItemClickListener {
        TextView   cart_p_name , cart_p_price , cart_p_count;
        ImageView cart_p_img;
        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            cart_p_img=itemView.findViewById(R.id.cart_p_pic);
            cart_p_name=itemView.findViewById(R.id.cart_p_name);
            cart_p_price=itemView.findViewById(R.id.cart_p_cost);
            cart_p_count=itemView.findViewById(R.id.iteam_amount);
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    }
}
