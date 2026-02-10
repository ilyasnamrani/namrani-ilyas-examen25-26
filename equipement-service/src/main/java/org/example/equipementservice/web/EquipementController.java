package org.example.equipementservice.web;


import org.example.equipementservice.entitie.Equipement;
import org.example.equipementservice.repository.EquipementRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipement")
public class EquipementController {

    private final EquipementRepository equipementRepository ;

    public EquipementController(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
    }

    @GetMapping("/all")
    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }

    @GetMapping("/{id}")
    public Equipement findEquipementById(@PathVariable Long id) {
    return equipementRepository.findById(id).get();
    }

    @PostMapping("/ceate")
    public Equipement ceateEquipement(@RequestBody Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @PutMapping("/update/{id}")
    public Equipement updateEquipement(@PathVariable Long id, @RequestBody Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementRepository.deleteById(id);
    }
}
