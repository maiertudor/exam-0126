package com.tm.exam126.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tm.exam126.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button idea_section_btn = (Button) findViewById(R.id.idea_section_btn);
        idea_section_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), IdeasActivity.class));
            }
        });

        Button project_section_btn = (Button) findViewById(R.id.project_section_btn);
        project_section_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProjectsActivity.class));
            }
        });
    }
}
