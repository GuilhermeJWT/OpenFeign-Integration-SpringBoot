package br.com.systemsgs.openfeign.client;

import br.com.systemsgs.openfeign.dto.placeholder.ModelDescricaoPost;
import br.com.systemsgs.openfeign.dto.placeholder.ModelFotosDTO;
import br.com.systemsgs.openfeign.dto.placeholder.ModelPostDTO;
import br.com.systemsgs.openfeign.dto.placeholder.ModelUsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "place-holder", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceHolderClient {

    @GetMapping(value = "/users")
    public List<ModelUsuarioDTO> getUsuarios();

    @GetMapping(value = "/posts")
    public List<ModelPostDTO> getPosts();

    @GetMapping(value = "/posts/{id}")
    public ModelPostDTO recuperaPorId(@PathVariable("id") Integer id);

    @GetMapping(value = "/posts/{id}/comments")
    public List<ModelDescricaoPost> pesquisaPostComments(@PathVariable("id") Integer id);

    @GetMapping(value = "/photos")
    public List<ModelFotosDTO> getFotos();

    @PostMapping(value = "/posts")
    ModelPostDTO salvaPost(ModelPostDTO modelPostDTO);

    @DeleteMapping(value = "/posts/{id}")
    ModelPostDTO deletaPost(@PathVariable("id") Integer id);
}
