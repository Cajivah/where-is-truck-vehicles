package com.whereistruck.domain.dto;

import java.math.BigDecimal;

import com.whereistruck.repository.entities.Location;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class LocationDto {
    private BigDecimal lat;
    private BigDecimal lng;

    public LocationDto(final BigDecimal lat, final BigDecimal lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public LocationDto(final Location currentLocation) {
        this.lat = currentLocation.getLat();
        this.lng = currentLocation.getLng();
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(final BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(final BigDecimal lng) {
        this.lng = lng;
    }
}
