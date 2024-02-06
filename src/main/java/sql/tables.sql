CREATE TABLE IF NOT EXISTS warehouse
(
    id SERIAL PRIMARY KEY ,
    vehicle_id int references vehicle(id)
);

CREATE TABLE IF NOT EXISTS vehicle
(
  id SERIAL PRIMARY KEY ,
  type VARCHAR (50),
  weight int
);