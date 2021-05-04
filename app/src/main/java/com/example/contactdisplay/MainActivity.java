package com.example.contactdisplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1, "123456789", "Gaurav");
    Contact o2 = new Contact(2, "123456789", "Gaurav");
    Contact o3 = new Contact(3, "123456789", "Gaurav");
    Contact o4 = new Contact(4, "123456789", "Gaurav");
    Contact o5 = new Contact(5, "123456789", "Gaurav");
    Contact o6 = new Contact(6, "123456789", "Gaurav");
    Contact o7 = new Contact(7, "123456789", "Gaurav");
    Contact o8 = new Contact(8, "123456789", "Gaurav");
    Contact o9 = new Contact(9, "123456789", "Gaurav");
    Contact o10 = new Contact(10, "123456789", "Gaurav");

    Contact [] contacts = {o1, o2, o3, o4, o5, o6, o7, o8, o9, o10};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}