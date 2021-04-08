package com.company.notification.storage.notificationstorage.entities;
import lombok.Getter;
import lombok.Setter;import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
@Getter
@Setter
@Entity
@Table(name = "notification")
public class NotificationEntity {

//    %enum%
    enum NotificationType {
        SMS, EMAIL
    }
//    %id%
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notification_id")
    private Integer id;
//    %date-notifytime%
    @Column(name = "notify_time",nullable = false)
    private Date notifyTime =new Date();
//    %date-dateCreated%
    @Column(name = "date_created",nullable = false)
    private LocalDateTime dateCreated = LocalDateTime.now();
//    %notificationType - enum%
    @Column(name = "notification_type")
    private NotificationType notificationtype;
//    %date-lastupdated%
    @Column(name = "last_updated",nullable=false)
    private Date lastUpdated = new Date();
//    %boolean-enable%
    @Column(name = "enable")
    private boolean enable;
//    %boolean - isSent%
    @Column(name = "is_sent")
    private boolean isSent;
//    %boolean-isRepeate%
    @Column(name = "is_repeate")
    private boolean isReapeat;
//    %user-userEntity%

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_mapped",referencedColumnName = "user_id")
    private UserEntity userEntity;
    public NotificationEntity() {
    }
    /*
    userEntity
isReapeat
isSent
enable
lastUpdated
notificationtype
dateCreated
notifyTime
id
    */
}
