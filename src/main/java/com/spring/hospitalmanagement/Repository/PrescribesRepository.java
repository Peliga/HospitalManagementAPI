package com.spring.hospitalmanagement.Repository;

import com.spring.hospitalmanagement.Model.Prescribes;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescribesRepository extends ListCrudRepository<Prescribes, Integer> {
}
