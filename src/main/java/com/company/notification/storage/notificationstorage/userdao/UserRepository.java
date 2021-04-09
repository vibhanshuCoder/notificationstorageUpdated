package com.company.notification.storage.notificationstorage.userdao;
import com.company.notification.storage.notificationstorage.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

//    @Query(value = "select * from user_info", nativeQuery = true)
//    Page<UserEntity> findAll(Pageable pageable);

}
