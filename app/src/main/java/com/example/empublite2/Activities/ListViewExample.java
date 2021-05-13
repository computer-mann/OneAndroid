package com.example.empublite2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.empublite2.R;

public class ListViewExample extends ListActivity {
    TextView textView;
    private static final String[] listItems={"lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);
        textView=(TextView)findViewById(R.id.selection);
        setListAdapter(new ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1,listItems));
        textView=(TextView)findViewById(R.id.selection);
    }
    @Override
    public void onListItemClick(ListView parent, View v, int position,long id) {
        textView.setText(listItems[position]);
    }

}