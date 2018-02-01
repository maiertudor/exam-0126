package com.tm.exam126.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tm.exam126.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddIdeaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddIdeaFragment extends Fragment {

    public AddIdeaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment AddIdeaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddIdeaFragment newInstance() {
        return new AddIdeaFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_idea, container, false);
    }

}
