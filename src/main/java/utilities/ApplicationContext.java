package utilities;

import connection.DBconnection;
import repository.VehicleRepository;
import repository.WarehouseRepository;
import service.VehicleService;
import service.WarehouseService;

import java.sql.Connection;

public class ApplicationContext {

    private final static Connection CONNECTION;
    private final static WarehouseRepository WAREHOUSE_REPOSITORY;
    private final static WarehouseService WAREHOUSE_SERVICE;
    private final static VehicleRepository VEHICLE_REPOSITORY;
    private final static VehicleService VEHICLE_SERVICE;

    static {
        CONNECTION = DBconnection.getConnection();
        WAREHOUSE_REPOSITORY=new WarehouseRepository(CONNECTION);
        WAREHOUSE_SERVICE=new WarehouseService(WAREHOUSE_REPOSITORY);

        VEHICLE_REPOSITORY=new VehicleRepository(CONNECTION);
        VEHICLE_SERVICE=new VehicleService(VEHICLE_REPOSITORY);
    }
    public static WarehouseService getWarehouseService(){return WAREHOUSE_SERVICE;}
    public static VehicleService getVehicleService(){return VEHICLE_SERVICE;}
}
