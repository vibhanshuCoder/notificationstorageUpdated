package com.company.notification.storage.notificationstorage.dao;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends CrudRepository<NotificationEntity,Integer> {
}
