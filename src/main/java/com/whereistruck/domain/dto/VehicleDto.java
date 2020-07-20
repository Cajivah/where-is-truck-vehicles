package com.whereistruck.domain.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class VehicleDto {
    private Long id;
    private String name;
    private Location currentLocation;

    public VehicleDto(final Long id, final String name, final Location currentLocation) {
        this.id = id;
        this.name = name;
        this.currentLocation = currentLocation;
    }

    public VehicleDto() {
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

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(final Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public static class Location {
        private String lat;
        private String lng;

        public Location(final String lat, final String lng) {
            this.lat = lat;
            this.lng = lng;
        }

        public Location() {
        }

        public String getLat() {
            return lat;
        }

        public void setLat(final String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(final String lng) {
            this.lng = lng;
        }
    }
}
