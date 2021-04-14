package com.company.notification.storage.notificationstorage.update;

import lombok.Data;

import java.util.List;

@Data
public class NotificationUpdate {

    List<Integer> ids;
//    Integer ids;
    boolean enableVal;

}
