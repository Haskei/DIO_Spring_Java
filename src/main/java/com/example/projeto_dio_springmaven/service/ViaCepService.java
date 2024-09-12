package com.example.projeto_dio_springmaven.service;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.projeto_dio_springmaven.accessindatajpa.Endereco;
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService  {
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
