package br.com.systemsgs.openfeign.client;

import br.com.systemsgs.openfeign.dto.cep.ModelCepDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cep-client", url = "https://viacep.com.br/ws")
public interface CepClient {

    @GetMapping(value = "/{cep}/json")
    ModelCepDTO obterCep(@PathVariable("cep") String cep);

}
