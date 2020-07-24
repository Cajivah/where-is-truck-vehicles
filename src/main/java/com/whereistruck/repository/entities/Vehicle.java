package com.whereistruck.repository.entities;

import java.util.Optional;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.whereistruck.domain.dto.VehicleDto;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.runtime.annotations.RegisterForReflection;

@Entity
@Table(name = "VEHICLES")
@RegisterForReflection
public class Vehicle extends PanacheEntity {

    @Column(name = "UUID", columnDefinition = "CHAR")
    private String uuid = UUID.randomUUID().toString();

    @Column(name = "NAME")
    private String name;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "LOCATION_ID")
    private Location currentLocation;

    public Vehicle() {
    }

    public Vehicle(final VehicleDto vehicleDto) {
        name = vehicleDto.getName();
    }

    public static Optional<Vehicle> findByUuid(final String uuid) {
        return Vehicle.<Vehicle>find("uuid", uuid).firstResultOptional();
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
