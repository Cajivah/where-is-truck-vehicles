package com.whereistruck.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.whereistruck.domain.VehicleService;
import com.whereistruck.domain.dto.VehicleDto;

@Path("/vehicles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VehiclesController {

    private final VehicleService vehicleService;

    @Inject
    public VehiclesController(final VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GET
    public List<VehicleDto> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @POST
    public VehicleDto createVehicle(final VehicleDto vehicleDto) {
        return vehicleService.createVehicle(vehicleDto);
    }
}
