package com.company.notification.storage.notificationstorage.dao;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity,Integer> {

    List<NotificationEntity> findNotificationEntityByUser(UserEntity userEntity);

    @Modifying
    @Transactional
//    @Query(value = "update notification set enable =:ena where notification_id in(18,19)",nativeQuery = true)
    @Query(value = "update NotificationEntity set enable =:ena where id IN(:ids)")
//   @Transactional
   void trigger(@Param("ids") List<Integer> ids ,@Param("ena") boolean enableVal);


}
