package com.whereistruck.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "VEHICLES")
public class Vehicle extends PanacheEntity {

    @Column(name = "NAME")
    private String name;
    @OneToOne
    @JoinColumn(name = "LOCATION_ID")
    private Location currentLocation;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(final Location currentLocation) {
        this.currentLocation = currentLocation;
    }

}
