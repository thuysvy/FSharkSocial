package com.poly.fshark_be.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "GROUPMEMBERS")
public class Groupmembers {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TIMEJOIN")
    private Date timeJoin;

    @ManyToOne
    @JoinColumn(name = "CONVERSATION")
    private Conversations conversation;

    @ManyToOne
    @JoinColumn(name = "USERNAME")
    private Users user;
}
