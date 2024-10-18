package br.com.fiap.monitoramento.controller;

import br.com.fiap.monitoramento.dto.SensorDTO;
import br.com.fiap.monitoramento.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensores")
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @GetMapping
    public List<SensorDTO> getAllSensores() {
        return sensorService.getAllSensores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SensorDTO> getSensorById(@PathVariable Long id) {
        SensorDTO sensorDTO = sensorService.getSensorById(id);
        if (sensorDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sensorDTO);
    }

    @PostMapping
    public SensorDTO createSensor(@RequestBody SensorDTO sensorDTO) {
        return sensorService.createSensor(sensorDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SensorDTO> updateSensor(@PathVariable Long id, @RequestBody SensorDTO sensorDTO) {
        SensorDTO updatedSensorDTO = sensorService.updateSensor(id, sensorDTO);
        if (updatedSensorDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedSensorDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSensor(@PathVariable Long id) {
        sensorService.deleteSensor(id);
        return ResponseEntity.ok().build();
    }
}