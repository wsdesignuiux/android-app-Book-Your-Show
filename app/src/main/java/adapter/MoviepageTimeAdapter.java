package adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.book_your_show.R;
import model.MenuModel;
import model.MoviepageTimeModel;

public class MoviepageTimeAdapter extends RecyclerView.Adapter<MoviepageTimeAdapter.MyViewHolder> {


    boolean showingfirst = false;

    int myPos=0;

    Context context;
    private ArrayList<MoviepageTimeModel>homeModelArrayList;

    public MoviepageTimeAdapter(Context context, ArrayList<MoviepageTimeModel> homeModelArrayList) {
        this.context = context;
        this.homeModelArrayList = homeModelArrayList;
    }

    @NonNull
    @Override
    public MoviepageTimeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_moviepage_day, parent, false);
        return new MoviepageTimeAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MoviepageTimeAdapter.MyViewHolder holder, final int position) {
        MoviepageTimeModel modelfoodrecycler = homeModelArrayList.get(position);


        holder.day.setText((CharSequence) modelfoodrecycler.getDay());
        holder.date.setText((CharSequence) modelfoodrecycler.getDate());



//        holder.ll1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                holder.ll1.setBackgroundResource(R.drawable.day_rect_moviepage);
//                holder.date.setTextColor(Color.parseColor("#000000"));
//
//            }
//        });

        if (myPos == position){
            holder.ll1.setBackgroundResource(R.drawable.day_rect_moviepage);
            holder.date.setTextColor(Color.parseColor("#000000"));



        }else {

            holder.ll1.setBackgroundResource(R.drawable.day_rect_moviepage_gray_square);
            holder.date.setTextColor(Color.parseColor("#c4c9df"));

        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();

            }


        });


    }

    @Override
    public int getItemCount() {
        return homeModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView day,date;
        LinearLayout ll1;

        public MyViewHolder(View itemView) {
            super(itemView);

            day = itemView.findViewById(R.id.day);
            date = itemView.findViewById(R.id.date);
            ll1 = itemView.findViewById(R.id.ll1);

        }
    }
}
