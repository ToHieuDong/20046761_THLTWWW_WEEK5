package com.example.week5.BACKEND.repositories;

import com.example.week5.BACKEND.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID> {
}
