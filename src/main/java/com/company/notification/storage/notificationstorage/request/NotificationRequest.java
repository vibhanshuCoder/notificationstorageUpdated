package com.company.notification.storage.notificationstorage.request;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import lombok.Data;
import java.util.Date;

@Data
public class NotificationRequest {

    private Date notifyReqTime;

    NotificationEntity.NotificationType notificationReqType;

    private Integer userId;

    private boolean isSent;

    private boolean isRepeat;

    private boolean enable;

}