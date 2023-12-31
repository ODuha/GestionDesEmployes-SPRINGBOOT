package com.employes.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employes.gestion.entity.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {
}
