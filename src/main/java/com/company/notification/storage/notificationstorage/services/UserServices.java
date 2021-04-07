package com.company.notification.storage.notificationstorage.services;
import com.company.notification.storage.notificationstorage.dao.NotificationRepository;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import com.company.notification.storage.notificationstorage.userdao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private NotificationRepository notificationRepository;

    public UserEntity createUser(UserEntity user)
    {
        return userRepository.save(user);
    }
}
