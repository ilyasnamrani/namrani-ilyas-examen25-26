package org.example.clientservice;

import org.example.clientservice.entitie.Client;
import org.example.clientservice.repo.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(ClientRepository clientRepository) {
        return args -> {
            Client client1 = Client.builder()
                    .firstName("Namrani")
                    .lastName("Ilyas")
                    .email("ilyas@gmail.com")
                    .telephone("0611223344")
                    .build();

            Client client2 = Client.builder()
                    .firstName("Elasri")
                    .lastName("Saad")
                    .email("saad@gmail.com")
                    .telephone("0611223344")
                    .build();
            Client client3 = Client.builder()
                    .firstName("Kamali")
                    .lastName("Kamal")
                    .email("kamal@gmail.com")
                    .telephone("0611223344")
                    .build();
            clientRepository.save(client1);
            clientRepository.save(client2);
            clientRepository.save(client3);
        };
    }
}
