package utilities;

import connection.DBconnection;
import repository.WarehouseRepository;
import service.WarehouseService;

import java.sql.Connection;

public class ApplicationContext {

    private final static Connection CONNECTION;
    private final static WarehouseRepository WAREHOUSE_REPOSITORY;
    private final static WarehouseService WAREHOUSE_SERVICE;

    static {
        CONNECTION = DBconnection.getConnection();
        WAREHOUSE_REPOSITORY=new WarehouseRepository(CONNECTION);
        WAREHOUSE_SERVICE=new WarehouseService(WAREHOUSE_REPOSITORY);
    }
    public static WarehouseService getWarehouseService(){return WAREHOUSE_SERVICE;}
}
