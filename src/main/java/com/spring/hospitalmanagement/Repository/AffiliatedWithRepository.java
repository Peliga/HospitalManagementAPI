package com.spring.hospitalmanagement.Repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffiliatedWithRepository extends ListCrudRepository<AffiliatedWithRepository, Integer> {
}
