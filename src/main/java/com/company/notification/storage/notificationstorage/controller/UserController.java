package com.company.notification.storage.notificationstorage.controller;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import com.company.notification.storage.notificationstorage.request.UserRequest;
import com.company.notification.storage.notificationstorage.response.UserResponse;
import com.company.notification.storage.notificationstorage.services.NotificationServices;
import com.company.notification.storage.notificationstorage.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
    private UserServices userServices;
    @Autowired
    private NotificationServices notificationServices;

    @PostMapping("/createUser")
    public UserEntity createUser(@RequestBody UserRequest user)
    {
        return userServices.createUser(user);
    }

    @GetMapping("/allUsers")
    public Iterable<UserEntity> allUsers()
    {
        return userServices.allUsers();
    }

    @GetMapping(value = "/userRespo",params ={"userId"} )
    public UserResponse userById(@RequestParam("userId")Integer userId)
    {
        return userServices.userById(userId);
    }

    @GetMapping(value = "/userList",params = {"pageno"})
    public Page<UserEntity> userPage(@RequestParam("pageno") Integer pageno)
    {
        return userServices.userPage(pageno);
    }
}
