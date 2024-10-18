package br.com.fiap.monitoramento.controller;

import br.com.fiap.monitoramento.dto.LeituraSensorDTO;
import br.com.fiap.monitoramento.service.LeituraSensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leiturassensores")
public class LeituraSensorController {
    @Autowired
    private LeituraSensorService leituraSensorService;




}
