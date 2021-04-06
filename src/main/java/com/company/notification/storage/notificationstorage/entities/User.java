package com.company.notification.storage.notificationstorage.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;

@Document(collection = "User")
@Getter
@Setter
@Entity
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
}
