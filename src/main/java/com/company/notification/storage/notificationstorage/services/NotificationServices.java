package com.company.notification.storage.notificationstorage.services;
import com.company.notification.storage.notificationstorage.dao.NotificationRepository;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import com.company.notification.storage.notificationstorage.request.NotificationRequest;
import com.company.notification.storage.notificationstorage.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServices
{
    @Autowired
    private NotificationRepository notificationRepository;
    @Autowired
    private UserRepository userRepository;

    public NotificationEntity createNotification(NotificationRequest notificationRequest) {
        NotificationEntity notification = new NotificationEntity();
        UserEntity user = userRepository.findById(notificationRequest.getUserId()).get();
        notification.setNotificationtype(notificationRequest.getNotificationReqType());
        notification.setNotifyTime(notificationRequest.getNotifyReqTime());
        notification.setUser(user);
        return notificationRepository.save(notification);
    }

    public Iterable<NotificationEntity> allNotifications(){
        Iterable<NotificationEntity> noti = notificationRepository.findAll();
        return noti;
    }

    public void deleteNotification(Integer id)
    {
        notificationRepository.deleteById(id);
    }

    public NotificationEntity enableDisableSwitch(NotificationRequest notificationRequest, String ids)
    {
        String[] id = ids.split("\\,");
        notificationRequest.setNotificationId(Integer.parseInt(String.valueOf(id)));

    }
}
