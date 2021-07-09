package br.com.systemsgs.openfeign.client;

import br.com.systemsgs.openfeign.dto.correios.ModelCorreiosDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "correios-client", url = "https://correios.contrateumdev.com.br/api")
public interface CorreiosClient {

    @PostMapping(value = "/rastreio")
    ModelCorreiosDTO rastreiaEncomenda(ModelCorreiosDTO modelCorreiosDTO);

}
