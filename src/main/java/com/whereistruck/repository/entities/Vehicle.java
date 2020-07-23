package com.whereistruck.repository.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.whereistruck.domain.dto.VehicleDto;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "VEHICLES")
public class Vehicle extends PanacheEntity {

    @Column(name = "UUID")
    private String uuid = UUID.randomUUID().toString();

    @Column(name = "NAME")
    private String name;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "LOCATION_ID")
    private Location currentLocation;

    public Vehicle() {
    }

    public Vehicle(final VehicleDto vehicleDto) {
        name = vehicleDto.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(final Location currentLocation) {
        this.currentLocation = currentLocation;
    }

}
