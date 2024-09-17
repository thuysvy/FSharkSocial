package com.poly.fshark_be.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "POSTIMAGES")
public class Postimages {
    @Id
    @Column(name = "ID")
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "POSTID")
    private Posts post;

    @ManyToOne
    @JoinColumn(name = "IMAGE")
    private Images image;
}
