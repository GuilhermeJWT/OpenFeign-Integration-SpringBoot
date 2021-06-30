package br.com.systemsgs.openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "place-holder", url = "https://jsonplaceholder.typicode.com/")
public interface JsonPlaceHolderClient {

}
