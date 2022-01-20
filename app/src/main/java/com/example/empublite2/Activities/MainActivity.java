package com.example.empublite2.Activities;

import static androidx.core.content.ContextCompat.getSystemService;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.empublite2.BuildConfig;
import com.example.empublite2.R;

public class MainActivity extends AppCompatActivity {

    Button firstbutton;
    Button secBtn;
    Button thirdBtn;
    Button fourthBtn;
    Button fifthBtn;
    Button sixthBtn;
    TextView mTextView;
    private static final String CHANNEL_WHATEVER="channel_whatever";
    private static int NOTIFY_ID=1337;
    private static final String AUTHORITY= BuildConfig.APPLICATION_ID+".provider";

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
            //Navigate(this,ForTheHorizon.class);
            raiseNotification();
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


    private void raiseNotification(){
        NotificationManager mgr=
                (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        mgr.createNotificationChannel(new NotificationChannel(CHANNEL_WHATEVER,
                "Whatever", NotificationManager.IMPORTANCE_DEFAULT));
        NotificationCompat.Builder b=
                new NotificationCompat.Builder(this, CHANNEL_WHATEVER);

        b.setAutoCancel(true);
        b.setContentTitle("First ever notification")
                .setContentText("Gunna's voice")
                .setSmallIcon(android.R.drawable.star_on);
        mgr.notify(NOTIFY_ID, b.build());
    }
}