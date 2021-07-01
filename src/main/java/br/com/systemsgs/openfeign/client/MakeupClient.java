package br.com.systemsgs.openfeign.client;

import br.com.systemsgs.openfeign.dto.makeup.ModelMakeupDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "makeup-client", url = "http://makeup-api.herokuapp.com/api/v1")
public interface MakeupClient {

    @GetMapping(value = "/products.json?brand={brand}")
    public List<ModelMakeupDTO> pesquisaBrand(@PathVariable("brand") String brand);

    @GetMapping(value = "/products.json?brand={brand}&product_type={product_type}")
    public List<ModelMakeupDTO> pesquisaBatomMarca(@PathVariable("brand") String brand, @PathVariable("product_type") String product_type);

}
