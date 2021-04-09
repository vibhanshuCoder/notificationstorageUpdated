package com.company.notification.storage.notificationstorage.response;

import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import lombok.Data;

import java.util.Date;

@Data
public class NotificationResponse
{
    private Integer notificationId;
    private boolean isSent;
    NotificationEntity.NotificationType notificationType;
    private boolean isRepeat;
    private boolean enable;
    private Integer userId;
}
