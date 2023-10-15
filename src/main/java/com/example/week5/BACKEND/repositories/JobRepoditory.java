package com.example.week5.BACKEND.repositories;

import com.example.week5.BACKEND.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepoditory extends JpaRepository<Job, UUID> {
}
