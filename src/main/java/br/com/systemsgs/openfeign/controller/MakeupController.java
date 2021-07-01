package br.com.systemsgs.openfeign.controller;

import br.com.systemsgs.openfeign.client.MakeupClient;
import br.com.systemsgs.openfeign.dto.makeup.ModelMakeupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/makeup")
public class MakeupController {

    @Autowired
    private MakeupClient makeupClient;

    @GetMapping(value = "/{brand}")
    public List<ModelMakeupDTO> pesquisaBrand(@PathVariable("brand") String brand){
        return makeupClient.pesquisaBrand(brand);
    }

    @GetMapping(value = "/{brand}/{product_type}")
    public List<ModelMakeupDTO> pesquisaBatomMarca(@PathVariable("brand") String brand, @PathVariable("product_type")String product_type){
        return makeupClient.pesquisaBatomMarca(brand, product_type);
    }

}
