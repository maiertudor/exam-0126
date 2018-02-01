package com.tm.exam126.activities;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tm.exam126.R;
import com.tm.exam126.fragments.AddIdeaFragment;
import com.tm.exam126.fragments.IdeasFragment;

/**
 * Last edit by tudor.maier on 01/02/2018.
 */
public class IdeasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ideas_activity);

        final FragmentManager fragmentManager = getFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.root_fragment, IdeasFragment.newInstance())
                .commit();

        Button add_idea_btn = (Button) findViewById(R.id.add_idea_btn);
        add_idea_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.root_fragment, AddIdeaFragment.newInstance())
                        .commit();
            }
        });

        Button remove_all = (Button) findViewById(R.id.remove_all_btn);
        remove_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });

        Button retry_btn = (Button) findViewById(R.id.retry_btn);
        retry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
