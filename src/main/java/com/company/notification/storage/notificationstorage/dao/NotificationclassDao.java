package com.company.notification.storage.notificationstorage.dao;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationclassDao extends MongoRepository<NotificationEntity,String> {
}
