package br.com.fiap.monitoramento.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SensorDTO {

    private Long id;
    private String tipoSensor;
    private String localizacao;
    private String status;
}
