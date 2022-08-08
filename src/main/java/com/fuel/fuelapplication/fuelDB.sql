create table dispatch(
	  id int(3) NOT NULL,
    date varchar(20) DEFAULT NULL,
    name varchar(20) DEFAULT NULL,
    license varchar(20) DEFAULT NULL,
    vehicle varchar(6) DEFAULT NULL,
    status varchar(20) DEFAULT NULL,
    PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

create table inventory(
  id int(10) NOT NULL,
  name varchar(30) DEFAULT NULL,
    quantity int(10) DEFAULT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

create table shedule(
	id int(10) NOT NULL,
    date Date DEFAULT NULL,
    name varchar(20) DEFAULT NULL,
    license varchar(20) DEFAULT NULL,
    vehicle varchar(6) DEFAULT NULL,
    shed_date Date
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

create table order(
  id int(10) NOT NULL,
	name varchar(20) DEFAULT NULL,
    license varchar(20) DEFAULT NULL,
    vehicle varchar(6) DEFAULT NULL,
    fuel_type varchar(10) DEFAULT NULL,
    capacity varchar(10) DEFAULT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- API for get all
http://localhost:8081/order/list

