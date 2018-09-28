package com.diviso.stream.kafka.consumer.repository;

import com.diviso.stream.kafka.consumer.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
