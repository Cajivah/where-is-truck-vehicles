package com.whereistruck.repository.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "VEHICLES")
public class Vehicle extends PanacheEntity {

    private String name;
    @OneToOne
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

    @Entity
    public static class Location {

        @Id
        private Long id;
        private String lat;
        private String lng;

        public Location() {
        }

        public Location(final Long id, final String lat, final String lng) {
            this.lat = lat;
            this.lng = lng;
        }

        public Long getId() {
            return id;
        }

        public void setId(final Long id) {
            this.id = id;
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
