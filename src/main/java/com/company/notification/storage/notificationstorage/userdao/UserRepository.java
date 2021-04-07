package com.company.notification.storage.notificationstorage.userdao;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,String> {

}
