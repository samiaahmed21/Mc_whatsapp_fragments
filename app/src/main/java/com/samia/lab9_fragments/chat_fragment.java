package com.samia.lab9_fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.samia.lab9_fragments.Model.Chats;
import com.samia.lab9_fragments.adapter.ChatsAdapter;

import java.util.ArrayList;
import java.util.List;

public class chat_fragment extends Fragment {
    RecyclerView recyclerView;
    ChatsAdapter chatsAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Chats> contactList = new ArrayList<>();

    public chat_fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewChat);
        contactList.add(new Chats("Sharjeel", R.drawable.dp7, "Bye", "11:36 AM"));
        contactList.add(new Chats("Umar", R.drawable.dp2, "Mjhy nahi pta <3", "01:00 AM"));
        contactList.add(new Chats("Sara", R.drawable.dp9, "enough?", "02:00 AM"));
        contactList.add(new Chats("Daddy", R.drawable.dp4, "Thankyou", "12:00 AM"));
        contactList.add(new Chats("Muaaz", R.drawable.dp3, "Btao jldii", "12:00 PM"));
        contactList.add(new Chats("Mama", R.drawable.dp5, "Okay baad mein baat hoti", "01:00 PM"));
        contactList.add(new Chats("Saima", R.drawable.dp1, "let me know asap", "12:00 AM"));


        chatsAdapter = new ChatsAdapter(getContext(), contactList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(chatsAdapter);

        DividerItemDecoration itemDecor = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.HORIZONTAL);
        Drawable divider = ContextCompat.getDrawable(getActivity(), R.drawable.divider);
        itemDecor.setDrawable(divider);
        recyclerView.addItemDecoration(itemDecor);

        return view;
    }
}