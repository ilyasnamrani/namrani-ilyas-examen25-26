package org.example.locationservice.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Equipement {
    private Long idEquipement;
    private String type ;
    private Long tarifJour ;
    private Boolean disponible ;

}
