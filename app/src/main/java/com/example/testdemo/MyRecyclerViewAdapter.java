package com.example.testdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

import java.util.List;
import java.util.Map;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.RecyclerHolder> {
    public Context mContext;
    public List<Data> mDatas = new ArrayList<>();
    public Data mData;


    public MyRecyclerViewAdapter(MainActivity recyclerView, List<Map<String, Object>> dataList) {
        recyclerView.getContext();
    }



    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simplesdapteractivity,null,false);
        return new RecyclerHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {
        if (holder instanceof  ViewHolde){

            holder.textView.setText(Data.get(position));

        }
    }

    @Override
    public int getItemCount() {
        return Data.size();
    }

    class RecyclerHolder extends RecyclerView.ViewHolder {
       TextView textView;

        private RecyclerHolder(View itemView) {
            super(itemView);


        }
    }
}