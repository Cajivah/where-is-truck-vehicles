package com.whereistruck.domain;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;

import com.whereistruck.domain.dto.VehicleDto;
import com.whereistruck.repository.entities.Vehicle;

@ApplicationScoped
public class VehicleService {
    public List<VehicleDto> getAllVehicles() {
        final List<Vehicle> vehicles = Vehicle.findAll().list();
        return vehicles.stream().map(VehicleDto::new).collect(Collectors.toList());
    }
}
