package com.example.empublite2.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.empublite2.R;

public class LayoutForLinear extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_for_linear);

        mTextView = (TextView) findViewById(R.id.text);


    }
}