package e.wolfsoft1.book_your_show;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.MenuAdapter;
import adapter.MoviepageTimeAdapter;
import adapter.SathyamAdapter;
import model.MenuModel;
import model.MoviepageTimeModel;
import model.SathyamModel;

public class Movie_Page extends AppCompatActivity {

    String[] day = {"FRI","SAT","SUN","MON","TUE","THUR"};
    String[] date = {"12","13","14","15","16","17"};

    String[] date1 =  {"09:30 AM","12:30 AM","03:30 PM","8:40 PM","8:40 PM","8:40 PM"};

    private MoviepageTimeAdapter homepageAdapter;
    private RecyclerView recyclerview;
    private ArrayList<MoviepageTimeModel> homeModelArrayList;



    private SathyamAdapter homepageAdapter1;
    private RecyclerView recyclerview1;
    private ArrayList<SathyamModel> homeModelArrayList1;

    private SathyamAdapter homepageAdapter2;
    private RecyclerView recyclerview2;
    private ArrayList<SathyamModel> homeModelArrayList2;

    private SathyamAdapter homepageAdapter3;
    private RecyclerView recyclerview3;
    private ArrayList<SathyamModel> homeModelArrayList3;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie__page);


        recyclerview = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Movie_Page.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        homeModelArrayList = new ArrayList<>();


        for (int i = 0; i <day.length; i++) {
            MoviepageTimeModel view = new MoviepageTimeModel(day[i],date[i]);
            homeModelArrayList.add(view);
        }
        homepageAdapter = new MoviepageTimeAdapter(Movie_Page.this,homeModelArrayList);
        recyclerview.setAdapter(homepageAdapter);



        recyclerview1 = findViewById(R.id.recyclerview1);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(Movie_Page.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerview1.setLayoutManager(layoutManager1);
        recyclerview1.setItemAnimator(new DefaultItemAnimator());

        homeModelArrayList1 = new ArrayList<>();


        for (int i = 0; i <date1.length; i++) {
            SathyamModel view1= new SathyamModel(date1[i]);
            homeModelArrayList1.add(view1);
        }
        homepageAdapter1 = new SathyamAdapter(Movie_Page.this,homeModelArrayList1);
        recyclerview1.setAdapter(homepageAdapter1);



        recyclerview2 = findViewById(R.id.recyclerview2);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(Movie_Page.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerview2.setLayoutManager(layoutManager2);
        recyclerview2.setItemAnimator(new DefaultItemAnimator());

        homeModelArrayList2 = new ArrayList<>();


        for (int i = 0; i <date1.length; i++) {
            SathyamModel view2= new SathyamModel(date1[i]);
            homeModelArrayList2.add(view2);
        }
        homepageAdapter2 = new SathyamAdapter(Movie_Page.this,homeModelArrayList2);
        recyclerview2.setAdapter(homepageAdapter2);



        recyclerview3 = findViewById(R.id.recyclerview3);
        RecyclerView.LayoutManager layoutManager3 = new LinearLayoutManager(Movie_Page.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerview3.setLayoutManager(layoutManager3);
        recyclerview3.setItemAnimator(new DefaultItemAnimator());

        homeModelArrayList3 = new ArrayList<>();


        for (int i = 0; i <date1.length; i++) {
            SathyamModel view3= new SathyamModel(date1[i]);
            homeModelArrayList3.add(view3);
        }
        homepageAdapter3 = new SathyamAdapter(Movie_Page.this,homeModelArrayList3);
        recyclerview3.setAdapter(homepageAdapter3);







    }
}
