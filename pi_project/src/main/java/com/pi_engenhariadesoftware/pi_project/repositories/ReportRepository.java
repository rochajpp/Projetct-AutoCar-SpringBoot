package com.pi_engenhariadesoftware.pi_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi_engenhariadesoftware.pi_project.entities.Report;

@Repository
public interface ReportRepository extends JpaRepository<Long, Report>{
    
}
