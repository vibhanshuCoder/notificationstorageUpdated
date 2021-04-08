package com.company.notification.storage.notificationstorage.controller;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import com.company.notification.storage.notificationstorage.services.NotificationServices;
import com.company.notification.storage.notificationstorage.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    @Autowired
    private UserServices userServices;
    @Autowired
    private NotificationServices notificationServices;

    @PostMapping(value = "/createNotification",params = {"userId"})
    public NotificationEntity createNotification(@RequestBody NotificationEntity notification, @RequestParam("userId") Integer userId)
    {

        return notificationServices.createNotification(notification,userId);
    }
}
