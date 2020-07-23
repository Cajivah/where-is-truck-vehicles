package com.whereistruck.domain.dto;

import java.util.Optional;

import com.whereistruck.repository.entities.Vehicle;

public class VehicleDto {
    private String uuid;
    private String name;
    private LocationDto locationDto;

    public VehicleDto() {
    }

    public VehicleDto(final Vehicle vehicle) {
        this.uuid = vehicle.getUuid();
        this.name = vehicle.getName();
        this.locationDto = Optional.ofNullable(vehicle.getCurrentLocation()).map(LocationDto::new).orElse(null);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
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
