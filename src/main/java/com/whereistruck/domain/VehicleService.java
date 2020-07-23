package com.whereistruck.domain;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import com.whereistruck.domain.dto.NewLocation;
import com.whereistruck.domain.dto.VehicleDto;
import com.whereistruck.repository.entities.Location;
import com.whereistruck.repository.entities.Vehicle;

@ApplicationScoped
public class VehicleService {
    public List<VehicleDto> getAllVehicles() {
        final List<Vehicle> vehicles = Vehicle.findAll().list();
        return vehicles.stream().map(VehicleDto::new).collect(Collectors.toList());
    }

    @Transactional
    public VehicleDto createVehicle(final VehicleDto vehicleDto) {
        final Vehicle vehicle = new Vehicle(vehicleDto);
        vehicle.persist();
        return new VehicleDto(vehicle);
    }

    @Transactional
    public void updateLocation(final NewLocation newLocation) {
        Vehicle.<Vehicle>find("uuid", newLocation.getKey()).firstResultOptional().ifPresent(vehicle -> this.updateLocation(vehicle, newLocation));
    }

    private void updateLocation(final Vehicle vehicle, final NewLocation newLocation) {
        final Location location = new Location(newLocation);
        vehicle.setCurrentLocation(location);
    }
}
