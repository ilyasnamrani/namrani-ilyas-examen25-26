package org.example.locationservice;

import org.example.locationservice.entitie.Location;
import org.example.locationservice.repo.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class LocationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocationServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LocationRepository locationRepository) {
        return args -> {
            Location location1 = Location.builder()
                    .idClient(1L)
                    .idEquipement(1L)
                    .dateDebut(LocalDate.parse("2026-01-01"))
                    .dateFin(LocalDate.parse("2026-01-10"))
                    .montantTotal(1555.2)
                    .build();

            Location location2 = Location.builder()
                    .idClient(2L)
                    .idEquipement(2L)
                    .dateDebut(LocalDate.parse("2026-01-01"))
                    .dateFin(LocalDate.parse("2026-01-10"))
                    .montantTotal(1255.2)
                    .build();


            locationRepository.save(location1);
            locationRepository.save(location2);
        };
    }
}
