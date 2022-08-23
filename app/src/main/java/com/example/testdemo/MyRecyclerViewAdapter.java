package com.example.testdemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;




import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {
    public Context mContext;
    public List<List<String>> mList;






    public MyRecyclerViewAdapter(Context mContext, List<List<String>> mList) {
        this.mContext = mContext;
        this.mList = mList;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.simplesdapteractivity, parent, false);
        MyViewHolder holder = new MyViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.iv1.setImageDrawable((Drawable) mList.get(position));
        holder.tv1.setText((CharSequence) mList.get(position));
        holder.tv2.setText((CharSequence) mList.get(position));
        holder.tv3.setText((CharSequence) mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();

    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv1;
        private TextView tv1;
        private TextView tv2;
        private TextView tv3;


        public MyViewHolder(View itemView) {
            super(itemView);
            iv1 = itemView.findViewById(R.id.img_star);
            tv1 = itemView.findViewById(R.id.person_name);
            tv2 = itemView.findViewById(R.id.person_score);
            tv3 = itemView.findViewById(R.id.person_local);
        }
    }

}