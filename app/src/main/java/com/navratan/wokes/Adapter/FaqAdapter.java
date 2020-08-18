package com.navratan.wokes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.navratan.wokes.Model.FaqModel;
import com.navratan.wokes.R;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FaqAdapter extends RecyclerView.Adapter<FaqAdapter.FaqViewHolder> {

    List<FaqModel> faqModels;

    public FaqAdapter(List<FaqModel> faqModels) {
        this.faqModels = faqModels;
    }

    @NonNull
    @Override
    public FaqViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faq, parent, false);
        return new FaqViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaqViewHolder holder, int position) {

        FaqModel faqModel = faqModels.get(position);
        Context context = holder.itemView.getContext();
        holder.questions.setText(faqModel.getQues());
        holder.answer.setText(faqModel.getAnswer());
        boolean isExpanded = faqModels.get(position).isExpanded();
        holder.linearLayout.setAnimation(AnimationUtils.loadAnimation(context,R.anim.bounce));
        holder.linearLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return faqModels.size();
    }

    public class FaqViewHolder extends RecyclerView.ViewHolder {
        TextView questions, answer;
        LinearLayout linearLayout;

        public FaqViewHolder(@NonNull View itemView) {
            super(itemView);
            questions = itemView.findViewById(R.id.question);
            answer = itemView.findViewById(R.id.answer);
            linearLayout = itemView.findViewById(R.id.expandableLayout);

            questions.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FaqModel model = faqModels.get(getAdapterPosition());
                    model.setExpanded(!model.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }

    }

}
