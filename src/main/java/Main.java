import model.Vehicle;
import service.VehicleService;
import service.WarehouseService;
import utilities.ApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        WarehouseService warehouseService = ApplicationContext.getWarehouseService();
//        warehouseService.addWarehouse();

        VehicleService vehicleService = ApplicationContext.getVehicleService();
//        vehicleService.save(new Vehicle("truck" , 4));
//        vehicleService.save(new Vehicle("truck" , 10));
//        vehicleService.save(new Vehicle("truck" , 3));
//        vehicleService.save(new Vehicle("car" , 1));
//        vehicleService.save(new Vehicle("car" , 2));
//        vehicleService.save(new Vehicle("car" , 1));
//        vehicleService.save(new Vehicle("car" , 3));

        System.out.println(warehouseService.calWeight("truck"));
        System.out.println(warehouseService.calWeight("car"));
        System.out.println(warehouseService.calWeight("truck") +
                warehouseService.calWeight("car"));
    }
}
