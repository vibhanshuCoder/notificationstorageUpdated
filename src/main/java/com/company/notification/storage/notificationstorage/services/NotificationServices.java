package com.company.notification.storage.notificationstorage.services;
import com.company.notification.storage.notificationstorage.dao.NotificationclassDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServices
{
    @Autowired
    private NotificationclassDao notificationclassDao;

}
