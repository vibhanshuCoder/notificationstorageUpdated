package com.company.notification.storage.notificationstorage.response;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import lombok.Data;

import java.util.List;

@Data
public class UserResponse
{
    private Integer userRespoId;
    private String userRespoName;
    private String userRespoEmail;
    private String userRespoPhone;
    private List<NotificationResponse> notificationResponse;
}
