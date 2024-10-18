package br.com.fiap.monitoramento.service;

import br.com.fiap.monitoramento.dto.SensorDTO;
import br.com.fiap.monitoramento.model.Sensor;
import br.com.fiap.monitoramento.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SensorService {
    @Autowired
    private SensorRepository sensorRepository;

    public List<SensorDTO> getAllSensores() {
        return sensorRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public SensorDTO getSensorById(Long id) {
        return sensorRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    public SensorDTO createSensor(SensorDTO sensorDTO) {
        Sensor sensor = convertToEntity(sensorDTO);
        return convertToDTO(sensorRepository.save(sensor));
    }

    public SensorDTO updateSensor(Long id, SensorDTO sensorDTO) {
        return sensorRepository.findById(id).map(sensor -> {
            sensor.setTipoSensor(sensorDTO.getTipoSensor());
            sensor.setLocalizacao(sensorDTO.getLocalizacao());
            sensor.setStatus(sensorDTO.getStatus());
            return convertToDTO(sensorRepository.save(sensor));
        }).orElse(null);
    }

    public void deleteSensor(Long id) {
        sensorRepository.deleteById(id);
    }

    private SensorDTO convertToDTO(Sensor sensor) {
        SensorDTO sensorDTO = new SensorDTO();
        sensorDTO.setId(sensor.getId());
        sensorDTO.setTipoSensor(sensor.getTipoSensor());
        sensorDTO.setLocalizacao(sensor.getLocalizacao());
        sensorDTO.setStatus(sensor.getStatus());
        return sensorDTO;
    }

    private Sensor convertToEntity(SensorDTO sensorDTO) {
        Sensor sensor = new Sensor();
        sensor.setId(sensorDTO.getId());
        sensor.setTipoSensor(sensorDTO.getTipoSensor());
        sensor.setLocalizacao(sensorDTO.getLocalizacao());
        sensor.setStatus(sensorDTO.getStatus());
        return sensor;
    }
}
