package e.wolfsoft1.book_your_show;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.BookyourshowAdapter;
import model.BookyourshowModel;

public class Bookyourshowlist extends AppCompatActivity {


    private ArrayList<BookyourshowModel> kwikListModelClasses;
    private RecyclerView recyclerView;
    private BookyourshowAdapter bAdapter;

    private String txt[]={"1.Register","2.Login","3.Movie-Page","4.Seat-Booking",
    "5.Menu","6.Home"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookyourshowlist_activity);


        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Bookyourshowlist.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        kwikListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            BookyourshowModel beanClassForRecyclerView_contacts = new BookyourshowModel(txt[i]);
            kwikListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new BookyourshowAdapter(Bookyourshowlist.this,kwikListModelClasses);
        recyclerView.setAdapter(bAdapter);


    }
}
