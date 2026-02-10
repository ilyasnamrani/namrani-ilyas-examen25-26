package org.example.locationservice.web;


import org.example.locationservice.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("client-service")
public interface ClientFeign {
    @GetMapping("/all")
    public List<Client> findAll();

    @GetMapping("/{id}")
    public Client findClientById(@PathVariable Long id);
}