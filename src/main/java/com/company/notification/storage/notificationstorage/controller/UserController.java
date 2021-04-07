package com.company.notification.storage.notificationstorage.controller;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import com.company.notification.storage.notificationstorage.services.NotificationServices;
import com.company.notification.storage.notificationstorage.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController
{
    @Autowired
    private UserServices userServices;
    @Autowired
    private NotificationServices notificationServices;

    @PostMapping("/createUser")
    public UserEntity createUser(@RequestBody UserEntity user)
    {
        return userServices.createUser(user);
    }
}
