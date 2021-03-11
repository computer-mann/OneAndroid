package com.example.empublite2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.empublite2.R;

public class MainActivity extends AppCompatActivity {

    Button firstbutton;
    Button secBtn;
    Button thirdBtn;
    Button fourthBtn;
    Button fifthBtn;
    Button sixthBtn;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Ayaa yaa");
        firstbutton=(Button)findViewById(R.id.firstBtn);
        secBtn=(Button)findViewById(R.id.secondBtn);
        thirdBtn=(Button)findViewById(R.id.thirdBtn);
        fourthBtn=(Button)findViewById(R.id.fourthBtn);
        mTextView=(TextView)findViewById(R.id.middleTxtView);

        firstbutton.setOnClickListener(event-> {
            Navigate(this,ForTheHorizon.class);
        });
        secBtn.setOnClickListener(event-> {
            Navigate(this,LayoutForLinear.class);
        });
        thirdBtn.setOnClickListener(event-> {
            Navigate(this,ForRelative.class);
        });
        fourthBtn.setOnClickListener(event-> {
            Navigate(this,ListViewExample.class);
        });
    }

    private static void Navigate(android.content.Context context,Class clo){
        Intent intent=new Intent(context,clo) ;
        context.startActivity(intent);
    }
}