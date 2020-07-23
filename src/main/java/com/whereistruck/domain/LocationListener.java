package com.whereistruck.domain;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import com.whereistruck.domain.dto.NewLocation;

@ApplicationScoped
public class LocationListener {

    private final VehicleService vehicleService;

    @Inject
    public LocationListener(final VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @Incoming("locations")
    public void listenForNewLocations(NewLocation newLocation) {
        vehicleService.updateLocation(newLocation);
    }
}
