package org.example.locationservice.repo;

import org.example.locationservice.entitie.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
