package org.example.equipementservice;

import org.example.equipementservice.entitie.Equipement;
import org.example.equipementservice.repository.EquipementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class EquipementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EquipementServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(EquipementRepository equipementRepository) {
        return args -> {
            Equipement equipement1 = Equipement.builder()
                    .type("Voiture")
                    .tarifJour(300L)
                    .disponible(true)
                    .build();

            Equipement equipement2 = Equipement.builder()
                    .type("Pochette")
                    .tarifJour(37L)
                    .disponible(true)
                    .build();

            equipementRepository.save(equipement1);
            equipementRepository.save(equipement2);
        };
    }
}
