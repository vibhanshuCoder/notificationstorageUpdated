package com.company.notification.storage.notificationstorage.controller;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import com.company.notification.storage.notificationstorage.request.NotificationRequest;
import com.company.notification.storage.notificationstorage.response.NotificationResponse;
import com.company.notification.storage.notificationstorage.services.NotificationServices;
import com.company.notification.storage.notificationstorage.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    @Autowired
    private UserServices userServices;
    @Autowired
    private NotificationServices notificationServices;

    @PostMapping(value = "/createNotification")
    public NotificationEntity createNotification(@RequestBody NotificationRequest notificationRequest) {
        return notificationServices.createNotification(notificationRequest);
    }

    @GetMapping(value = "/allNotification")
    public Iterable<NotificationEntity> allNotification()
    {
        return notificationServices.allNotifications();
    }
    @DeleteMapping(value = "/deleteNotification", params = {"id"})
    public void deleteNotification(@RequestParam("id")Integer id)
    {
        notificationServices.deleteNotification(id);
    }

    @PutMapping(value = "/trigger")
    public NotificationEntity eableDisableSwitch(@RequestBody NotificationRequest notificationRequest, @RequestParam String id)
    {
        return notificationServices.enableDisableSwitch(notificationRequest,id);
    }
}