package org.example.clientservice.repo;

import org.example.clientservice.entitie.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
