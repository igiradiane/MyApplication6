package com.example.myapplication;

import android.annotation.SuppressLint;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
  int IMAGES[] = new int[]{R.drawable.drk1,R.drawable.pasta,R.drawable.pizza};
  String ITEMS[] = new String[]{"SOFT DRIKS","MAIN DISHES","APPETIZERS"};
  String DESCRI[] = new  String[]{"FANTA------->1000" +
          "JUICE------->1500" +
          "COFFEE----->2000","PASTA $ CHIPS------->3000" +
          "FISH----->7000" +
          "CHICKEN------->9000","CREPES-------->500" +
          "BURGER-------->2000" +
          "PIZZA-------->3000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ListView listView = findViewById(R.id.listvi);
        ListAdapter listAdapter = new ListAdapter() {
            @Override
            public boolean areAllItemsEnabled() {
                return false;
            }

            @Override
            public boolean isEnabled(int position) {
                return false;
            }

            @Override
            public void registerDataSetObserver(DataSetObserver observer) {

            }

            @Override
            public void unregisterDataSetObserver(DataSetObserver observer) {

            }

            @Override
            public int getCount() {
                return IMAGES.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public boolean hasStableIds() {
                return false;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                @SuppressLint("ViewHolder") View view = getLayoutInflater().inflate(R.layout.listlayout,null);
                ImageView imageView = (ImageView)findViewById(R.id.image);
                TextView tv1 = (TextView)findViewById(R.id.tv1);
                TextView tv2 =(TextView)findViewById(R.id.tv2);
                imageView.setImageResource(IMAGES[position]);
                tv1.setText(ITEMS[position]);
                tv2.setText(DESCRI[position]);
                return view;

            }

            @Override
            public int getItemViewType(int position) {
                return 0;
            }

            @Override
            public int getViewTypeCount() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        };
        
    }
}
