package com.example.contacts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsFragment extends Fragment {
    View v;
    private RecyclerView myRecyclerView;
    private List<contact>lstContact;
    public ContactsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.contacts_fragments,container,false);
        myRecyclerView=(RecyclerView)v.findViewById(R.id.recycle);
        RecyclerViewAdapter recyclerAdapter=new RecyclerViewAdapter(getContext(),lstContact);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstContact=new ArrayList<>();
        lstContact.add(new contact("Aya  ","01116360192",R.drawable.aaa));
        lstContact.add(new contact("reem","01116360192",R.drawable.unnamed));
        lstContact.add(new contact("Hekmat","01116360192",R.drawable.ccc));
        lstContact.add(new contact("Asmaa","01116360192",R.drawable.fffff));
        lstContact.add(new contact("Ahmed","01116360192",R.drawable.hggg));
        lstContact.add(new contact("Annem","01116360192",R.drawable.ccc));
        lstContact.add(new contact("Babam","01116360192",R.drawable.aaa));
        lstContact.add(new contact("Diva","01116360192",R.drawable.fffff));
        lstContact.add(new contact("Aml","01116360192",R.drawable.aaa));

    }
}
