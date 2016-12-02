package com.example.administrator.phonebook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    private int count;
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }
    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.mTextView.setText(String.valueOf(position));
    }
    @Override
    public int getItemCount() {
        return count;
    }
    class MyHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
        private MyHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.nametv);
        }
    }
}
