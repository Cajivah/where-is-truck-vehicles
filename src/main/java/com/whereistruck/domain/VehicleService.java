package com.whereistruck.domain;

import java.util.List;

import com.whereistruck.domain.dto.VehicleDto;
import com.whereistruck.repository.entities.Vehicle;

public class VehicleService {
    public List<VehicleDto> getAllVehicles() {
        return Vehicle.findAll().project(VehicleDto.class).list();
    }
}
