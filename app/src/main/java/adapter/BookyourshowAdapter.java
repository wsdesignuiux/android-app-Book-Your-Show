package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import e.wolfsoft1.book_your_show.Home;
import e.wolfsoft1.book_your_show.Login;
import e.wolfsoft1.book_your_show.Movie_Page;
import e.wolfsoft1.book_your_show.R;
import e.wolfsoft1.book_your_show.Register;
import e.wolfsoft1.book_your_show.Seat_Booking;
import model.BookyourshowModel;


public class BookyourshowAdapter extends RecyclerView.Adapter<BookyourshowAdapter.MyViewHolder> {

    Context context;


    private List<BookyourshowModel> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public BookyourshowAdapter(Context context, List<BookyourshowModel> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public BookyourshowAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bookyourshow_list, parent, false);


        return new BookyourshowAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        BookyourshowModel lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, Register.class);
                    context.startActivity(i);
                }else if(position == 1) {
                    Intent i = new Intent(context, Login.class);
                    context.startActivity(i);
                }else if(position == 2) {
                    Intent i = new Intent(context, Movie_Page.class);
                    context.startActivity(i);
                }else if(position == 3) {
                    Intent i = new Intent(context, Seat_Booking.class);
                    context.startActivity(i);
                }else if(position == 4) {
                    Intent i = new Intent(context, e.wolfsoft1.book_your_show.Menu.class);
                    context.startActivity(i);
                }else if(position == 5) {
                    Intent i = new Intent(context, Home.class);
                    context.startActivity(i);
                }

            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


