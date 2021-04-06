package com.company.notification.storage.notificationstorage;
import com.company.notification.storage.notificationstorage.userdao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@SpringBootApplication
public class NotificationStorageAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationStorageAppApplication.class, args);
    }

}
