package com.example.mailbox;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class SreachMail extends Fragment {
    Button button;
    public SreachMail(){
        //re
    }

    @Nullable



        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_sreach_mail, container, false);
        button =v.findViewById(R.id.search);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeMail homeMail=new HomeMail();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_container,homeMail);
                transaction.commit();
            }
        });
        return v;




    }






}