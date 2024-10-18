package br.com.fiap.monitoramento.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;


@Entity
@Table(name = "sensor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "tipoSensor")
    private String tipoSensor;

    @NotBlank
    @Column(name = "localizacao")
    private String localizacao;

    @NotNull
    private String status;

}
