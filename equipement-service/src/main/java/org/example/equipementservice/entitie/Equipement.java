package org.example.equipementservice.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity @Getter
@Setter @ToString @AllArgsConstructor
@NoArgsConstructor @Builder
public class Equipement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idEquipement;
    private String type ;
    private Long tarifJour ;
    private Boolean disponible ;

}
