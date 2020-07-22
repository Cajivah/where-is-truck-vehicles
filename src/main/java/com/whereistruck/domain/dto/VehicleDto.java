package com.whereistruck.domain.dto;

import java.util.Optional;

import com.whereistruck.repository.entities.Vehicle;

import io.quarkus.runtime.annotations.RegisterForReflection;

public class VehicleDto {
    private Long id;
    private String name;
    private LocationDto locationDto;

    public VehicleDto() {
    }

    public VehicleDto(final Vehicle vehicle) {
        this.id = vehicle.id;
        this.name = vehicle.getName();
        this.locationDto = Optional.ofNullable(vehicle.getCurrentLocation()).map(LocationDto::new).orElse(null);
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public LocationDto getLocationDto() {
        return locationDto;
    }

    public void setLocationDto(final LocationDto locationDto) {
        this.locationDto = locationDto;
    }
}
