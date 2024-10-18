package br.com.fiap.monitoramento.repository;

import br.com.fiap.monitoramento.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeituraSensorRepository extends JpaRepository<Sensor, Long> {

}
