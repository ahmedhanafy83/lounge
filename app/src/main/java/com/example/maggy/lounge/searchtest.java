package com.example.maggy.lounge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class searchtest extends AppCompatActivity implements SearchView.OnQueryTextListener {
ListView listviewtest;
    ArrayList<String> list_search = new ArrayList<String>();
    ArrayAdapter adapter;
    String names[] = {"fashion", "love", "lovely", "hello", "world", "dresses", "gocci", "Pull & Bear"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchtest);
        listviewtest =findViewById(R.id.listviewtest);
        showAll();
    }

    public void showAll() {
        adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, names);
        listviewtest.setAdapter(adapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.back,menu);
        SearchView searchview = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.search));
        searchview.setOnQueryTextListener((SearchView.OnQueryTextListener) this);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int a = item.getItemId();
        switch (a) {
            case R.id.back:
                Intent b = new Intent(this, MainActivity.class);
                startActivity(b);
                finish();
                break;

        }
        return true;
    }
    @Override
    public boolean onQueryTextSubmit(String query) {
        search(query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        search(newText);

        return false;
    }


    public void search(String word){

        if(word.length() > 1){
            list_search.clear();
            for(int i = 0;i < names.length;i++) {
                String name = names[i];
                name.toLowerCase();
                if (name.contains(word)) {
                    list_search.add(name);
                }
            }
            adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,list_search);
            listviewtest.setAdapter(adapter);

        }

    }
}



