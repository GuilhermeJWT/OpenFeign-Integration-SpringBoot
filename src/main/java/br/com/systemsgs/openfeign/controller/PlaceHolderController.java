package br.com.systemsgs.openfeign.controller;

import br.com.systemsgs.openfeign.client.JsonPlaceHolderClient;
import br.com.systemsgs.openfeign.dto.placeholder.ModelPostDTO;
import br.com.systemsgs.openfeign.dto.placeholder.ModelUsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/placehoder")
public class PlaceHolderController {

    @Autowired
    private JsonPlaceHolderClient jsonPlaceHolderClient;

    @GetMapping(value = "/listaUsers")
    public List<ModelUsuarioDTO> recuperTodosUsuarios(){
        return jsonPlaceHolderClient.getUsuarios();
    }

    @GetMapping(value = "/listaPosts")
    public List<ModelPostDTO> recuperaTodosPost(){
        return jsonPlaceHolderClient.getPosts();
    }

    @GetMapping(value = "/pesquisaPorId/{id}")
    public ModelPostDTO recuperaPorId(@PathVariable("id") Integer id){
        return jsonPlaceHolderClient.recuperaPorId(id);
    }

}
