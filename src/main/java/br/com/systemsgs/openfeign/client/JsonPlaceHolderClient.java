package br.com.systemsgs.openfeign.client;

import br.com.systemsgs.openfeign.dto.placeholder.ModelUsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "place-holder", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceHolderClient {

    @GetMapping(value = "/users")
    public List<ModelUsuarioDTO> getUsuarios();

}
