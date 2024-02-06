package repository;

import model.Warehouse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WarehouseRepository {
    private final Connection connection;

    public WarehouseRepository(Connection connection) {
        this.connection = connection;
    }

    public int save (Warehouse warehouse) throws SQLException {
        int result = 0 ;
        String sql = "INSERT INTO warehouse (vehicle_id) VALUES (?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1,warehouse.getVehicleId());
            result = ps.executeUpdate();
        }
        return result ;
    }

    public void delete (int id) throws SQLException {
        String sql = "DELETE FROM warehouse WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1,id);

            ps.executeUpdate();
        }
    }
}
