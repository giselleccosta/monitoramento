package br.com.fiap.monitoramento.service;

import br.com.fiap.monitoramento.dto.LeituraSensorDTO;
import br.com.fiap.monitoramento.repository.LeituraSensorRepository;
import br.com.fiap.monitoramento.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeituraSensorService {
    @Autowired
    private LeituraSensorRepository leituraSensorRepository;

    @Autowired
    private SensorRepository sensorRepository;




}
