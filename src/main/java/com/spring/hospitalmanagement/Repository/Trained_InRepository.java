package com.spring.hospitalmanagement.Repository;

import com.spring.hospitalmanagement.Model.Trained_In;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Trained_InRepository extends ListCrudRepository<Trained_In, Integer> {
}
