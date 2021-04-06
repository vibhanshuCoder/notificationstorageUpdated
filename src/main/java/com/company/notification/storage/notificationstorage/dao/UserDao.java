package com.company.notification.storage.notificationstorage.dao;

import com.company.notification.storage.notificationstorage.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends MongoRepository<User,String> {

}
