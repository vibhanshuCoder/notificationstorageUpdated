package com.company.notification.storage.notificationstorage.entities;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;


@Data
@Table(name = "user_info")
@Entity
@Validated
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    @NotNull
    private Integer userId;

    @Column(name = "user_name",nullable = false)
    @Pattern(regexp = "^[a-zA-Z-]+ [a-zA-Z]+$")
    @NotNull(message = "invalid user name")
    private String userName;

    @Column(name = "user_email",nullable = false)
    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z-]+.[a-zA-z]+$")
//    Where,
//        ^ matches the starting of the sentence.
//        [a-zA-Z0-9+_.-] matches one character from the English alphabet (both cases), digits, “+”, “_”, “.” and, “-” before the @ symbol.
//        + indicates the repetition of the above-mentioned set of characters one or more times.
//        @ matches itself.
//        [a-zA-Z0-9.-] matches one character from the English alphabet (both cases), digits, “.” and “–” after the @ symbol.
//        $ indicates the end of the sentence
    @NotNull
    private String email;

    @Column(name = "user_phone",nullable = false)
    @Pattern(regexp = "^[6-9]\\d{9}$",message = "Enter valid mobile number")
    @Valid
    @NotNull
    private String userPhone;
    @OneToMany(mappedBy = "userEntity",fetch = FetchType.LAZY)
    private List<NotificationEntity> notificationEntityList;

}
