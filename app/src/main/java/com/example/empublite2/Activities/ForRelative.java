package com.example.empublite2.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.empublite2.R;

public class ForRelative extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_relative);

        mTextView = (TextView) findViewById(R.id.text);


    }
}