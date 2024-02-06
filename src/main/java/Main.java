import service.WarehouseService;
import utilities.ApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        WarehouseService warehouseService = ApplicationContext.getWarehouseService();
        warehouseService.addWarehouse();
    }
}
