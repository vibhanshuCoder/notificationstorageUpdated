package com.company.notification.storage.notificationstorage.request;

import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class UserRequest
{
    @Pattern(regexp = "^[a-zA-Z-]+ [a-zA-Z]+$")
    private String userReqName;
    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z-]+.[a-zA-z]+$")
    private String userReqEmail;
    @Pattern(regexp = "^[6-9]\\d{9}$")
    private String userReqPhone;
}
