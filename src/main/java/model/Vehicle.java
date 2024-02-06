package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicle {
    int id ;
    String type ;
    int weight ;

    public Vehicle(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }
}
