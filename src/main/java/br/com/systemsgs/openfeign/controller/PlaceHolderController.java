package br.com.systemsgs.openfeign.controller;

import br.com.systemsgs.openfeign.client.JsonPlaceHolderClient;
import br.com.systemsgs.openfeign.dto.placeholder.ModelDescricaoPost;
import br.com.systemsgs.openfeign.dto.placeholder.ModelFotosDTO;
import br.com.systemsgs.openfeign.dto.placeholder.ModelPostDTO;
import br.com.systemsgs.openfeign.dto.placeholder.ModelUsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/pesquisaPostComents/{id}")
    public List<ModelDescricaoPost> pesquisaPostComments(@PathVariable("id") Integer id){
        return jsonPlaceHolderClient.pesquisaPostComments(id);
    }

    @GetMapping(value = "/fotos")
    public List<ModelFotosDTO> listaFotos(){
        return jsonPlaceHolderClient.getFotos();
    }

    @PostMapping(value = "/salvaPost")
    public ResponseEntity<ModelPostDTO> salvaPost(@RequestBody ModelPostDTO modelPostDTO){
        ModelPostDTO postSalvo = jsonPlaceHolderClient.salvaPost(modelPostDTO);

        return ResponseEntity.ok(postSalvo);
    }

}
