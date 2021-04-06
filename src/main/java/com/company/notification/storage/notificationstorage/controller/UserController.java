package com.company.notification.storage.notificationstorage.controller;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import com.company.notification.storage.notificationstorage.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
public class UserController
{
    @Autowired
    private UserServices userServices;

    @PostMapping(name = "/createUser")
    public UserEntity createUser(@RequestBody UserEntity user)
    {
        return userServices.createUser(user);
    }
}
