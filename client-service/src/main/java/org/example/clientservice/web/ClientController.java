package org.example.clientservice.web;

import org.example.clientservice.entitie.Client;
import org.example.clientservice.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @GetMapping("/all")
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Client findClientById(@PathVariable Long id) {
        return clientRepository.findById(id).get();
    }

    @PostMapping("/create")
    public Client create(@RequestBody Client client) {
        return clientRepository.save(client);
    }

@PutMapping("/update/{id}")
public Client update(@PathVariable Long id, @RequestBody Client client) {
        return clientRepository.save(client);
}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientRepository.deleteById(id);
    }
}
