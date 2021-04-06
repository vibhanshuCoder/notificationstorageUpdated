package com.company.notification.storage.notificationstorage.userdao;


import com.company.notification.storage.notificationstorage.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity,String> {

}
