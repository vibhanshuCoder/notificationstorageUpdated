package com.company.notification.storage.notificationstorage.controller;
import com.company.notification.storage.notificationstorage.services.NotificationServices;
import com.company.notification.storage.notificationstorage.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/notification")
public class NotificationController {

    @Autowired
    private UserServices userServices;
    @Autowired
    private NotificationServices notificationServices;
}
