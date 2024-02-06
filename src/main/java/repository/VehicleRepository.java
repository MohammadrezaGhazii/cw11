package repository;

import model.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehicleRepository {

    private final Connection connection;

    public VehicleRepository(Connection connection) {
        this.connection = connection;
    }
    public int save (Vehicle vehicle) throws SQLException {
        int result = 0 ;
        String sql = "INSERT INTO vehicle (type, weight) VALUES (?,?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, vehicle.getType());
            ps.setInt(2,vehicle.getWeight());

            result = ps.executeUpdate();
        }
        return result;
    }
}
