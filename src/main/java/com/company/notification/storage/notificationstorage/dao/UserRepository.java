package com.company.notification.storage.notificationstorage.dao;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
