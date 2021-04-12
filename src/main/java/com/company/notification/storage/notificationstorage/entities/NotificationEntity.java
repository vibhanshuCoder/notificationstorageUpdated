package com.company.notification.storage.notificationstorage.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;import javax.persistence.*;
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
    public enum NotificationType {
        SMS, EMAIL
    }

    //    %id-userId%
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notification_id")
    private Integer id;
    //    %date-notifytime%
    @Column(name = "notify_time", nullable = false)
    private Date notifyTime = new Date();
    //    %date-dateCreated%
    @Column(name = "date_created", nullable = false)
    private LocalDateTime dateCreated = LocalDateTime.now();
    //    %notificationType - enum%
    @Column(name = "notification_type")
    private NotificationType notificationtype;
    //    %date-lastupdated%
    @Column(name = "last_updated", nullable = false)
    private Date lastUpdated = new Date();
    //    %boolean-enable%
    @Column(name = "enable")
    private boolean enable;
    //    %boolean - isSent%
    @Column(name = "is_sent")
    private boolean sent;
    //    %boolean-isRepeate%
    @Column(name = "is_repeate")
    private boolean reapeat;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "user_id_info",referencedColumnName = "user_id")
    private UserEntity user;
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