package com.company.notification.storage.notificationstorage.services;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import com.company.notification.storage.notificationstorage.userdao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public UserEntity createUser(UserEntity user)
    {
        return userRepository.save(user);
    }
}
