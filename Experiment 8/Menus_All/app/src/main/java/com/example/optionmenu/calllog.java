package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class calllog extends AppCompatActivity {

    private ListView mListView;
    private String[] contacts = {"Deepanshu", "Charu", "Vedant", "Raghav"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calllog);

        mListView = findViewById(R.id.List);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, contacts
        );
        mListView.setAdapter(adapter);
        registerForContextMenu(mListView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context,menu);
        menu.setHeaderTitle("Select Action");

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.call){
            Toast.makeText(this, "call selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if(item.getItemId() == R.id.sms) {
            Toast.makeText(this, "sms selected", Toast.LENGTH_SHORT).show();
        }else{
            return false;
        }
        return true;
    }
}