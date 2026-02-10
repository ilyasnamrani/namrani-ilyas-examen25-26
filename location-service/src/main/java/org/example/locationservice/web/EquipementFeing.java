package org.example.locationservice.web;

import org.example.locationservice.model.Equipement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("equipement-service")
public interface EquipementFeing {
    @GetMapping("/all")
    public List<Equipement> findAll() ;

    @GetMapping("/{id}")
    public Equipement findEquipementById(@PathVariable Long id) ;
}
