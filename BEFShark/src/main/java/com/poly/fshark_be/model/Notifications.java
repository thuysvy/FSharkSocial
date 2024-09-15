package com.poly.fshark_be.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "NOTIFICATIONS")
public class Notifications {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "STATUS")
    private Boolean status;

    @Column(name = "CREATEDATE")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "TYPE")
    private Types type;

    @ManyToOne
    @JoinColumn(name = "POST")
    private Posts post;

    @ManyToOne
    @JoinColumn(name = "USER")
    private Users user;
}
