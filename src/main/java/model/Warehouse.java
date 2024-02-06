package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Warehouse {
    int id ;
    int vehicleId ;

    public Warehouse(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
