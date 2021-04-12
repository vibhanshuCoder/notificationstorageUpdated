package com.company.notification.storage.notificationstorage.services;
import com.company.notification.storage.notificationstorage.dao.NotificationRepository;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import com.company.notification.storage.notificationstorage.request.UserRequest;
import com.company.notification.storage.notificationstorage.response.NotificationResponse;
import com.company.notification.storage.notificationstorage.response.UserResponse;
import com.company.notification.storage.notificationstorage.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
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
        List<NotificationEntity> list = notificationRepository.findNotificationEntityByUser(userEntity);

        List<NotificationResponse> notificationResponseList = new ArrayList<>() ;
        for (NotificationEntity notificationEntity : list)
        {
            NotificationResponse notificationResponse = new NotificationResponse();
            notificationResponse.setNotificationId(notificationEntity.getId());
            notificationResponse.setNotificationType(notificationEntity.getNotificationtype());
            notificationResponse.setRepeat(notificationEntity.isReapeat());
            notificationResponse.setEnable(notificationEntity.isEnable());
            notificationResponse.setSent(notificationEntity.isSent());
            notificationResponseList.add(notificationResponse);
        }
        userResponse.setUserRespoId(userEntity.getUserId());
        userResponse.setUserRespoEmail(userEntity.getEmail());
        userResponse.setUserRespoName(userEntity.getUserName());
        userResponse.setUserRespoPhone(userEntity.getUserPhone());
        userResponse.setNotificationResponse(notificationResponseList);
        return userResponse;
    }

    public Page<UserEntity> userPage(Integer pageno)
    {
        return userRepository.findAll(PageRequest.of(pageno,3));

    }

    public void deleteUser(Integer Id)
    {
        userRepository.deleteById(Id);
    }

    public UserEntity updateUser(UserRequest userRequest,Integer userId)
    {
        UserEntity userEntity = userRepository.findById(userId).get();
        userEntity.setUserPhone(userRequest.getUserReqPhone());
        userEntity.setEmail(userRequest.getUserReqEmail());
        return userRepository.save(userEntity);
    }
}
