package com.company.notification.storage.notificationstorage.entities;
import lombok.Getter;
import lombok.Setter;import javax.persistence.*;
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
@Getter
@Setter
@Entity
@Table(name = "notification")
public class NotificationEntity {
    enum NotificationType {
        SMS, EMAIL
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(name = "notify_time",nullable = false)
    private Date notifyTime;
    @Column(name = "date_created",nullable = false)
    private Date dateCreate;
    @Column(name = "notification_type",nullable = false)
    private NotificationType notificationtype;
    @Column(name = "last_updated",nullable=false)
    private Date lastUpdated;
    @Column(name = "enable",nullable = false)
    private boolean enable;
    @Column(name = "is_sent",nullable = false)
    private boolean isSent;
    @Column(name = "is_repeate",nullable = false)
    private boolean isReapeat;

    public NotificationEntity() {
    }
}
