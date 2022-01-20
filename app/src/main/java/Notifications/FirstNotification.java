//package Notifications;
//
//import static androidx.core.content.ContextCompat.getSystemService;
//
//import android.app.NotificationChannel;
//import android.app.NotificationManager;
//import android.app.Notification;
//
//import androidx.core.app.NotificationCompat;
//
//import com.example.empublite2.BuildConfig;
//
//public class FirstNotification {
//    private static final String CHANNEL_WHATEVER="channel_whatever";
//    private static int NOTIFY_ID=1337;
//    private static final String AUTHORITY= BuildConfig.APPLICATION_ID+".provider";
//
//    private void raiseNotification(){
//        NotificationManager mgr=
//                (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
//        mgr.createNotificationChannel(new NotificationChannel(CHANNEL_WHATEVER,
//                "Whatever", NotificationManager.IMPORTANCE_DEFAULT));
//        NotificationCompat.Builder b=
//                new NotificationCompat.Builder(this, CHANNEL_WHATEVER);
//
//        b.setAutoCancel(true);
//        b.setContentTitle("First ever notification")
//                .setContentText("Gunna voice")
//                .setSmallIcon(android.R.drawable.stat_notify_error);
//        mgr.notify(NOTIFY_ID, b.build());
//    }
//}
