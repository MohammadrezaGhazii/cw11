package repository;

import model.Warehouse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public int calWeight(String type) throws SQLException {
        int weight = 0 ;
        String sql = "SELECT sum(V.weight) FROM warehouse W JOIN vehicle V\n" +
                "ON W.vehicle_id = V.id\n" +
                "WHERE V.type = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1 , type);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()){
                weight = resultSet.getInt(1);
            }
        }
        return weight;
    }
}
