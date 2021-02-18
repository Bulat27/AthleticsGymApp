package com.example.athleticsgymapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListaTreningaAdapter extends RecyclerView.Adapter<ListaTreningaAdapter.ViewHolder>{

    private ArrayList<Trening> treninzi = new ArrayList<>();
    private Context context;//NE ZNAM DA LI CE MI OVO TREBATI

    public ListaTreningaAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_treninga,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imeTreninga.setText(treninzi.get(position).getImeTreninga());
        //Pokusacu da dodam sliku direktno, a ne sa neta
        Glide.with(context).
                asBitmap()
                .load(treninzi.get(position).getUrlSlike())
                .into(holder.slikaTreninga);
        
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Nanaan", Toast.LENGTH_SHORT).show();
            }
        });
        
        
    }

    @Override
    public int getItemCount() {
        return treninzi.size();
    }


    public void setTreninzi(ArrayList<Trening> treninzi) {
        this.treninzi = treninzi;
        notifyDataSetChanged();//Mislim da mi ni ovo nece trebati
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private CardView parent;
        private ImageView slikaTreninga;
        private TextView imeTreninga;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            slikaTreninga=itemView.findViewById(R.id.slikaTreninga);
            imeTreninga=itemView.findViewById(R.id.imeTreninga);
        }
    }


}
