package com.samia.lab9_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.samia.lab9_fragments.Model.Chats;
import com.samia.lab9_fragments.adapter.ChatsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnChat,btnStatus,btnCall;
    RecyclerView recyclerView;
    ChatsAdapter ChatAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Chats> contactList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        btnChat=findViewById(R.id.btnChat);
        btnCall=findViewById(R.id.btnCall);
        btnStatus=findViewById(R.id.btnStatus);
        getSupportFragmentManager().beginTransaction().add(R.id.container,new chat_fragment()).commit();
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new call_fragment()).commit();
            }
        });
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new chat_fragment()).commit();
            }
        });
        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new status_fragment()).commit();
            }
        });



    }
}