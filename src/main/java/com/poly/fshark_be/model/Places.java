package com.poly.fshark_be.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "PLACES")
public class Places {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAMEPLACE")
    private String namePlace;

    @Column(name = "LONGITUDE")
    private String longitude;

    @Column(name = "LATITUDE")
    private String latitude;

    @Column(name = "URLMAP")
    private String urlmap;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "place")
    private List<Placetrips> placeTrips;

    @OneToMany(mappedBy = "place")
    private List<Placeimages> placeImages;
}
