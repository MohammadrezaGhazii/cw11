package service;

import model.Warehouse;
import repository.WarehouseRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class WarehouseService {

    private final WarehouseRepository warehouseRepository;
    Scanner scanner = new Scanner(System.in);
    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public void addWarehouse() throws SQLException {
        System.out.println("** Add to Warehouse **");
        System.out.println("Please Enter vehicle ID :");
        int id = scanner.nextInt();
        scanner.nextLine();

        int result = warehouseRepository.save(new Warehouse(id));
        if (result == 1)
            System.out.println(" vehicle has successfully add");
        else
            System.out.println("Error - Something is wrong");
    }
}
