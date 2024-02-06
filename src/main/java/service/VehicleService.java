package service;

import model.Vehicle;
import repository.VehicleRepository;

import java.sql.SQLException;

public class VehicleService {
    private final VehicleRepository vehicleRepository ;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public int save (Vehicle vehicle) throws SQLException {
        return vehicleRepository.save(vehicle);
    }
}
