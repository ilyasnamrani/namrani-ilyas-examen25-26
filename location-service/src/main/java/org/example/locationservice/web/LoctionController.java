package org.example.locationservice.web;

import org.example.locationservice.entitie.Location;
import org.example.locationservice.model.Client;
import org.example.locationservice.model.Equipement;
import org.example.locationservice.repo.LocationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/location")
public class LoctionController {

    private final LocationRepository locationRepository;
    private final EquipementFeing equipementFeing;
    private final ClientFeign clientFeign;
   public LoctionController(LocationRepository locationRepository,
                            EquipementFeing equipementFeing,
                            ClientFeign clientFeign) {
       this.locationRepository = locationRepository;
       this.equipementFeing = equipementFeing;
       this.clientFeign = clientFeign;
   }

   @GetMapping("/all")
    public List<Location> getAllLocations(){
       List<Equipement> equipements = equipementFeing.findAll();
       List<Client> clients = clientFeign.findAll();
       List<Location> locations = locationRepository.findAll();
       for (Location location : locations) {
           for (Client client : clients) {
               if (client.getIdClient() == location.getIdClient()) {
                   location.setClient(client);
               }
           }
           for (Equipement equipement : equipements) {
               if (location.getIdEquipement() == (location.getIdEquipement())) {
                   location.setEquipement(equipement);
               }
           }
       }
       return locations;
   }

   @GetMapping("/{id}")
    public Location getLocationById(@PathVariable Long id){
       Optional<Location> location = locationRepository.findById(id);
       Client client = clientFeign.findClientById(location.get().getIdClient());
       Equipement equipement =  equipementFeing.findEquipementById(location.get().getIdEquipement());
       location.get().setClient(client);
       location.get().setEquipement(equipement);
       return location.get();   }

   @PutMapping("/create")
    public Location createLocation(@RequestBody Location location){
       return locationRepository.save(location);
   }

   @PutMapping("/update/{id}")
   public Location updateLocation(@PathVariable Long id, @RequestBody Location location){
       return locationRepository.save(location);
   }

   @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable Long id){
       locationRepository.deleteById(id);
   }
}
