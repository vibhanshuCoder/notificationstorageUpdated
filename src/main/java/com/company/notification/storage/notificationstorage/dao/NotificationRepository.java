package com.company.notification.storage.notificationstorage.dao;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity,Integer> {

    List<NotificationEntity> findNotificationEntityByUser(UserEntity userEntity);

}
