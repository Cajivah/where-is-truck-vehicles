package com.whereistruck.repository.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "LOCATIONS")
public class Location extends PanacheEntity {

    @Column(name = "LAT")
    private BigDecimal lat;

    @Column(name = "LNG")
    private BigDecimal lng;

    public Location() {
    }

    public Location(final BigDecimal lat, final BigDecimal lng) {
        this.lat = lat;
        this.lng = lng;
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
