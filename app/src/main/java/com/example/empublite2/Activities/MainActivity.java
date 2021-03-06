package com.example.empublite2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.empublite2.Activities.ForRelative;
import com.example.empublite2.R;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button firstbutton;
    Button secBtn;
    Button thirdBtn;
    Button fourthBtn;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstbutton=(Button)findViewById(R.id.firstBtn);
        mTextView=(TextView)findViewById(R.id.middleTxtView);

        firstbutton.setOnClickListener(event-> {
           // Toast.makeText(this,"Awesomeness",Toast.LENGTH_LONG).show();
//            Snackbar.make(event,"Snack, awesome",Snackbar.LENGTH_LONG)
//                    .setAction("Some Action",null).show();
            Intent intent= new Intent(this, ForRelative.class);
            String a="Made it Out";

            startActivity(intent);
        });
    }
}