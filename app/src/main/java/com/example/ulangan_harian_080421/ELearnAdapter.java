package com.example.ulangan_harian_080421;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ELearnAdapter extends RecyclerView.Adapter<ELearnAdapter.ELearnViewHolder> {

    private ArrayList<ELearn> dataList;

    public ELearnAdapter(ArrayList<ELearn> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ELearnViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_view, parent, false);
        return new ELearnViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ELearnViewHolder holder, int position) {
        holder.txtSubject.setText(dataList.get(position).getSubject());
        holder.txtJumlah.setText(dataList.get(position).getJumlah());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ELearnViewHolder extends RecyclerView.ViewHolder {
        private TextView txtSubject, txtJumlah;

        public ELearnViewHolder(View itemView) {
            super(itemView);
            txtSubject = (TextView) itemView.findViewById(R.id.txt_subject);
            txtJumlah = (TextView) itemView.findViewById(R.id.txt_jumlah);
        }
    }
}