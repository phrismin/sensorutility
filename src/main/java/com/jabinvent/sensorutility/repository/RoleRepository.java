package com.jabinvent.sensorutility.repository;

import com.jabinvent.sensorutility.entity.Role;
import com.jabinvent.sensorutility.model.EnumRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// TODO
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(EnumRole name);
}
