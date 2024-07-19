package com.spring.hospitalmanagement.Repository;

import com.spring.hospitalmanagement.Model.Affiliated_with;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffiliatedWithRepository extends ListCrudRepository<Affiliated_with, Integer> {
}
