package com.company.notification.storage.notificationstorage.dao;
import com.company.notification.storage.notificationstorage.entities.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity,Integer> {
}
