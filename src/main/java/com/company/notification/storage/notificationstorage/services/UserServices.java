package com.company.notification.storage.notificationstorage.services;
import com.company.notification.storage.notificationstorage.dao.NotificationRepository;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import com.company.notification.storage.notificationstorage.request.UserRequest;
import com.company.notification.storage.notificationstorage.response.UserResponse;
import com.company.notification.storage.notificationstorage.userdao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private NotificationRepository notificationRepository;


    public UserEntity createUser(UserRequest user)
    {   UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getUserReqName());
        userEntity.setUserPhone(user.getUserReqPhone());
        userEntity.setEmail(user.getUserReqEmail());
        return userRepository.save(userEntity);
    }

    public Iterable<UserEntity> allUsers() {
        return userRepository.findAll();
    }

    public UserResponse userById(Integer userId) {
        UserEntity userEntity = userRepository.findById(userId).get();
        UserResponse userResponse = new UserResponse();
        userResponse.setUserRespoId(userEntity.getUserId());
        userResponse.setUserRespoEmail(userEntity.getEmail());
        userResponse.setUserRespoName(userEntity.getUserName());
        userResponse.setUserRespoPhone(userEntity.getUserPhone());
        return userResponse;
    }

    public Page<UserEntity> userPage(Integer     pageno)
    {
        return userRepository.findAll(PageRequest.of(pageno,3));

    }
}
