package br.com.systemsgs.openfeign.controller;

import br.com.systemsgs.openfeign.client.CepClient;
import br.com.systemsgs.openfeign.dto.cep.ModelCepDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/cep")
public class CepController {

    @Autowired
    private CepClient cepClient;

    @GetMapping(value = "/{cep}")
    public ResponseEntity<ModelCepDTO> obterCep(@PathVariable("cep") String cep){
        ModelCepDTO modelCepDTO = cepClient.obterCep(cep);

        return ResponseEntity.ok(modelCepDTO);
    }

}
