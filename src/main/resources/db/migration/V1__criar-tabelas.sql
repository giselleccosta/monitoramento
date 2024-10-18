CREATE TABLE sensor (
    sensor_id int NOT NULL AUTO_INCREMENT,
    tipo_sensor VARCHAR2(50),
    localizacao VARCHAR2(100),
    status VARCHAR2(20)
);


CREATE TABLE leitura_sensor (
    leitura_id int NOT NULL AUTO_INCREMENT,
    sensor_id int REFERENCES sensor(sensor_id),
    data_leitura DATE,
    valor int
);