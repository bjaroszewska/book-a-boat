package com.ajna.bookaboat.respository;


import com.ajna.bookaboat.entity.Boat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BoatRepository extends JpaRepository<Boat, Integer>, JpaSpecificationExecutor<Boat> {

    Optional<Boat> findByName(@Param("name") String name);

}
