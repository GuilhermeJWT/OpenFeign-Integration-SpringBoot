package br.com.systemsgs.openfeign.controller;

import br.com.systemsgs.openfeign.client.JsonPlaceHolderClient;
import br.com.systemsgs.openfeign.dto.placeholder.ModelUsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/placehoder")
public class PlaceHolderController {

    @Autowired
    private JsonPlaceHolderClient jsonPlaceHolderClient;

    @GetMapping(value = "/lista")
    public List<ModelUsuarioDTO> recuperTodosUsuarios(){
        return jsonPlaceHolderClient.getUsuarios();
    }

}
