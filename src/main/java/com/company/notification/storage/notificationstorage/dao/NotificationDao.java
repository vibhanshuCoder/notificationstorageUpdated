package com.company.notification.storage.notificationstorage.dao;

import com.company.notification.storage.notificationstorage.entities.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationDao extends MongoRepository<Notification,String> {
}
