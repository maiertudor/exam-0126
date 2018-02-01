package com.tm.exam126.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.tm.exam126.R;

/**
 * A fragment representing a list of Items.
 * <p/>
 * interface.
 */
public class IdeasFragment extends Fragment {

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public IdeasFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static IdeasFragment newInstance() {
        IdeasFragment fragment = new IdeasFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ideas_list, container, false);

        ListView ideasListView = (ListView) view.findViewById(R.id.ideas_list_view);

        return view;
    }

}
