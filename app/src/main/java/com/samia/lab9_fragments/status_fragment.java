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

import com.samia.lab9_fragments.Model.Status;
import com.samia.lab9_fragments.adapter.StatusAdapter;

import java.util.ArrayList;
import java.util.List;


public class status_fragment extends Fragment {
    RecyclerView recyclerView;
    StatusAdapter statusAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Status> contactList_Status = new ArrayList<>();

    public status_fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewStatus);
        contactList_Status.add(new Status("Saima", R.drawable.dp1, "Today 3:15am"));
        contactList_Status.add(new Status("Sarah", R.drawable.dp9, "Today 5:08pm"));
        contactList_Status.add(new Status("Sharjeel", R.drawable.dp7, "Today 8:36pm"));
        contactList_Status.add(new Status("Umar", R.drawable.dp2, "Today 1:55am"));


        statusAdapter = new StatusAdapter(getContext(), contactList_Status);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(statusAdapter);

        DividerItemDecoration itemDecor = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.HORIZONTAL);
        Drawable divider = ContextCompat.getDrawable(getActivity(), R.drawable.divider);
        itemDecor.setDrawable(divider);
        recyclerView.addItemDecoration(itemDecor);

        return view;
    }
}