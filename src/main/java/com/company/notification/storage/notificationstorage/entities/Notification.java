package com.company.notification.storage.notificationstorage.entities;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

//---------------------------//
/*
"id":"",
	notificationType" : "%type%", </
	"user" : "%user%",
	"notifyTime" : "%time%", </
	"dateCreated": "%dateCreated%",
	"lastUpdated" : "%lastupdated%",
	"enabled": "%enable%",
	"isSent": "%true/false%",
	"isRepeat": "true/false"
*/

@Document(collection = "notification")
@Getter
@Setter
@Entity
public class Notification {

    enum NotificationType {
        SMS, EMAIL
    }
    @Id
    private String id;
    private Date notifyTime;
    private LocalDateTime dateCreate = LocalDateTime.now();
    private NotificationType notificationtype;
    private Date lastUpdated;
    private boolean enable;
    private boolean isSent;
    private boolean isReapeat;
}
