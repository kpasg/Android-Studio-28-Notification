package com.example.a028;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button show = findViewById(R.id.button);



        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                newinfo();
            }
        });
    }

    public void newinfo()
    {
        NotificationManager info = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.mipmap.ic_launcher)
                //.setTicker("xx特價")
                .setContentTitle("收訊息，網路廢人")
                .setContentText("又有一個臉書廢文");

        Notification notification = builder.build();
        info.cancel(0);
        info.notify(0, notification);
    }


}