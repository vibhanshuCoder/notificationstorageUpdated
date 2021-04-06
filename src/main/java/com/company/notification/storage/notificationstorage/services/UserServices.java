package com.company.notification.storage.notificationstorage.services;

import com.company.notification.storage.notificationstorage.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserDao userDao;
}
