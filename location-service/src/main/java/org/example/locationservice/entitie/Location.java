package org.example.locationservice.entitie;

import jakarta.persistence.*;
import lombok.*;
import org.example.locationservice.model.Client;
import org.example.locationservice.model.Equipement;

import java.time.LocalDate;

@Entity @Getter @Builder
@Setter @ToString  @NoArgsConstructor  @AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocation;
    private Long idClient ;
    private Long idEquipement ;
    private LocalDate dateDebut ;
    private LocalDate dateFin ;
    private Double montantTotal;

    @Transient
    private Client client;

    @Transient
    private Equipement equipement ;

}
