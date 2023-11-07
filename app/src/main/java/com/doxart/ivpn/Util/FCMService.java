package com.doxart.ivpn.Util;


import static androidx.core.app.NotificationCompat.PRIORITY_MIN;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FCMService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);

        RemoteMessage.Notification notification = message.getNotification();

        if (notification == null) return;

        String title = message.getNotification().getTitle();
        String text = message.getNotification().getBody();

        NotificationUtils notify = new NotificationUtils(this);

        if (text != null & title != null) {
            if (text.startsWith("@free") & !SharePrefs.getInstance(this).getBoolean("premium")) notify.sendNotification(title, text.replace("@free", ""), false);
            else if (text.startsWith("@all")) notify.sendNotification(title, text.replace("@all", ""), false);
        }
    }

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
    }
}
