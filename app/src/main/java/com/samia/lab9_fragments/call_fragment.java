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

import com.samia.lab9_fragments.Model.Calls;
import com.samia.lab9_fragments.adapter.CallAdapter;

import java.util.ArrayList;
import java.util.List;

public class call_fragment extends Fragment {

    RecyclerView recyclerView_calls;
    CallAdapter callAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Calls> contactList_calls = new ArrayList<>();

    public void CallFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        recyclerView_calls = view.findViewById(R.id.recyclerViewChat);
        contactList_calls.add(new Calls("Saima ", R.drawable.dp1, "Today 10:12am", R.drawable.call));
        contactList_calls.add(new Calls("Umar ", R.drawable.dp2, "Today 1:55am", R.drawable.call));
        contactList_calls.add(new Calls("Muaaz", R.drawable.dp3, "Today 8:36pm", R.drawable.call));
        contactList_calls.add(new Calls("Daddy", R.drawable.dp4, "Today 5:08pm", R.drawable.call));
        contactList_calls.add(new Calls("Mama ", R.drawable.dp5, "Today 3:15am", R.drawable.call));
        contactList_calls.add(new Calls("Nani", R.drawable.dp6, "Yesterday 11:11am", R.drawable.call));
        contactList_calls.add(new Calls("Sharjeel", R.drawable.dp7, "Yesterday 9:43pm", R.drawable.call));
        contactList_calls.add(new Calls("Maryum ", R.drawable.dp8, "Yesterday 6:48pm", R.drawable.call));


        callAdapter = new CallAdapter(getContext(), contactList_calls);
        recyclerView_calls.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView_calls.setLayoutManager(layoutManager);
        recyclerView_calls.setAdapter(callAdapter);

        DividerItemDecoration itemDecor = new DividerItemDecoration(recyclerView_calls.getContext(), DividerItemDecoration.HORIZONTAL);
        Drawable divider = ContextCompat.getDrawable(getActivity(), R.drawable.divider);
        itemDecor.setDrawable(divider);
        recyclerView_calls.addItemDecoration(itemDecor);

        return view;
    }
}