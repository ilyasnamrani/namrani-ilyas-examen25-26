package org.example.equipementservice.repository;

import org.example.equipementservice.entitie.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
