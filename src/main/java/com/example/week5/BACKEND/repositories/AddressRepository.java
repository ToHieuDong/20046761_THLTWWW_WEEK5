package com.example.week5.BACKEND.repositories;

import com.example.week5.BACKEND.entity.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<Address, UUID> {
}
