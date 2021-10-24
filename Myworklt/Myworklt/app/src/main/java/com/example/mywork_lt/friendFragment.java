package com.example.mywork_lt;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link friendFragment# method to
 * create an instance of this fragment.
 */
public class friendFragment extends Fragment {

    private RecyclerView recyclerView;
    private Context context;
    private List<String> list;
    private  myadapter myadapter;

    public friendFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_friend,container,false);
        context=view.getContext();
        recyclerView=view.findViewById(R.id.recyclerView);
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        myadapter = new myadapter(list,context);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(manager);
        

        return view;
    }



}