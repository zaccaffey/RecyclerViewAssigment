package com.example.recyclerviewassigment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.WordViewHolder> {
    private final ArrayList<Recipes> recipeList;
    private LayoutInflater inflater;
    private OnItemClickListener clickListener;

    public Adapter(Context context, ArrayList<Recipes> recipeList) {
        inflater = LayoutInflater.from(context);
        this.recipeList = recipeList;
    }

    @NonNull
    @Override
    public Adapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.recycler_row, parent, false);
        return new WordViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        Recipes current = recipeList.get(position);

        holder.firstText.setText(current.getHeading());
        //current = userList.get(++position);
        holder.secondText.setText(current.getBody());
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    public void setClickListener(OnItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final TextView firstText;
        public final TextView secondText;
        final Adapter mAdapter;


        public WordViewHolder(@NonNull View itemView, Adapter adapter) {
            super(itemView);
            firstText = itemView.findViewById(R.id.textHeading);
            secondText = itemView.findViewById(R.id.textBody);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(firstText.getContext(), "test", Toast.LENGTH_SHORT).show();
            if (clickListener != null) {
                clickListener.onClick(view, getAdapterPosition());
            }
        }
    }
}
