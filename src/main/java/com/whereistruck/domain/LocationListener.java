package com.whereistruck.domain;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import com.whereistruck.domain.dto.NewLocation;

import io.smallrye.reactive.messaging.annotations.Blocking;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

@ApplicationScoped
public class LocationListener {
    private final Logger LOGGER = LoggerFactory.getLogger(LocationListener.class);

    private final VehicleService vehicleService;

    @Inject
    public LocationListener(final VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @Incoming("locations")
    @Blocking
    public void listenForNewLocations(NewLocation newLocation) {
        LOGGER.debug("Received new Location: " + newLocation);
        vehicleService.updateLocation(newLocation);
    }
}
