package com.company.notification.storage.notificationstorage.services;
import com.company.notification.storage.notificationstorage.dao.NotificationRepository;
import com.company.notification.storage.notificationstorage.userdao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServices
{
    @Autowired
    private NotificationRepository notificationRepository;
    @Autowired
    private UserRepository userRepository;



}
