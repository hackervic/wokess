package com.navratan.wokes.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.system.Os;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.navratan.wokes.Model.OrdersModel;
import com.navratan.wokes.Order_details;
import com.navratan.wokes.R;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.OrderViewHolder> {

    private List<OrdersModel> ordersModels;

    public OrdersAdapter(List<OrdersModel> ordersModels) {
        this.ordersModels = ordersModels;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_order_layout, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        OrdersModel ordersModel = ordersModels.get(position);
        String str = ordersModel.getGetOrder_product_status();
        if (str.equals("Delivered") || str.equals("delivered") || str.equals("DELIVERED")) {
            int colour = Color.parseColor("#22b20c");
            holder.Ostatus.setTextColor(colour);

        } else if (str.equals("Cancelled") || str.equals("CANCELLED") || str.equals("cancelled")) {
            int colour = Color.parseColor("#f40e0e");
            holder.Ostatus.setTextColor(colour);

        } else if (str.equals("Pending") || str.equals("pending") || str.equals("PENDING")) {
            int colour = Color.parseColor("#1e0ef4");
            holder.Ostatus.setTextColor(colour);
        }
        final Context context = holder.itemView.getContext();
        holder.Oquantity.setText("Qty : " + ordersModel.getOrder_quantity());
        holder.Odate.setText(ordersModel.getOrder_time_stamp());
        holder.Ostatus.setText(ordersModel.getGetOrder_product_status());
        holder.OppaymentMode.setText(ordersModel.getOrder_payment_mode());
        holder.Opid.setText(ordersModel.getOrder_id());
        holder.cardrelativeLayout.setAnimation(AnimationUtils.loadAnimation(context, R.anim.down_to_up));
        holder.arrow_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, Order_details.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return ordersModels.size();
    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder {
        TextView Odate, Ostatus, Opid, OppaymentMode, Oquantity;
        CardView cardrelativeLayout;
        ImageButton arrow_detail;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            Odate = itemView.findViewById(R.id.order_product_date_t);
            Ostatus = itemView.findViewById(R.id.order_status);
            Oquantity = itemView.findViewById(R.id.order_quantity);
            Opid = itemView.findViewById(R.id.order_product_id);
            OppaymentMode = itemView.findViewById(R.id.order_payment_mode);
            cardrelativeLayout = itemView.findViewById(R.id.order_relative);
            arrow_detail=itemView.findViewById(R.id.get_order_details);
        }
    }
}
