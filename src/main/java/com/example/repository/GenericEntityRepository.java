package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.GenericEntity;

public interface GenericEntityRepository extends JpaRepository<GenericEntity, Long> {
}
