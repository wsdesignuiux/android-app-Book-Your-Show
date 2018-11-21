package adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.book_your_show.R;
import model.HomeModel;
import model.SathyamModel;

public class SathyamAdapter extends RecyclerView.Adapter<SathyamAdapter.MyViewHolder> {

    Context context;
    private ArrayList<SathyamModel> homeModelArrayList1;

    private Boolean showingfirst = false;

    public SathyamAdapter(Context context, ArrayList<SathyamModel> homeModelArrayList1) {
        this.context = context;
        this.homeModelArrayList1 = homeModelArrayList1;
    }

    @NonNull
    @Override
    public SathyamAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_moviepage_sathyam, parent, false);
        return new SathyamAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SathyamAdapter.MyViewHolder holder, int position) {
        SathyamModel modelfoodrecycler = homeModelArrayList1.get(position);


        holder.date1.setText(modelfoodrecycler.getDate1());

        holder.date1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (showingfirst == true) {
                    holder.date1.setBackgroundResource(R.drawable.day_rect_moviepage);

                    holder.date1.setTextColor(Color.parseColor("#000000"));
                    showingfirst = false;
//
                } else if (showingfirst == false) {
                    holder.date1.setBackgroundResource(R.drawable.gray_fillclr_moviepage_rect);
//                    holder.date1.setTextColor(Integer.parseInt("#afb5bb"));
                    holder.date1.setTextColor(Color.parseColor("#afb5bb"));
                    showingfirst = true;

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return homeModelArrayList1.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView date1;


        public MyViewHolder(View itemView) {
            super(itemView);

            date1 = itemView.findViewById(R.id.date1);
        }
    }
}
