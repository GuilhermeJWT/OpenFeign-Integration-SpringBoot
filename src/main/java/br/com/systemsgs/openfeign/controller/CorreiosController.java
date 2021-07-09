package br.com.systemsgs.openfeign.controller;

import br.com.systemsgs.openfeign.client.CorreiosClient;
import br.com.systemsgs.openfeign.dto.correios.ModelCorreiosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/correios")
public class CorreiosController {

    @Autowired
    private CorreiosClient correiosClient;

    @PostMapping(value = "/rastrear")
    public ResponseEntity<ModelCorreiosDTO> rastreiaEncomenda(@RequestBody ModelCorreiosDTO modelCorreiosDTO){
        ModelCorreiosDTO retornoRastreio = correiosClient.rastreiaEncomenda(modelCorreiosDTO);

        System.out.println(retornoRastreio.getCode());
        System.out.println(retornoRastreio.getType());
        return ResponseEntity.ok(retornoRastreio);
    }

}
