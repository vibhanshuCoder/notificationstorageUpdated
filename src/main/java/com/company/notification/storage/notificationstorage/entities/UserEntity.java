package com.company.notification.storage.notificationstorage.entities;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Entity;
import javax.persistence.Id;

@Document(collection = "User")
@Getter
@Setter
@Entity
public class UserEntity {

    @Id
    @Indexed(useGeneratedName = true)
    private String id;
    @Indexed(name = "name")
    private String name;
    @Indexed(name = "email")
    private String email;
    @Indexed(name = "phone")
    private String phone;

    public UserEntity(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public UserEntity(){}
}
