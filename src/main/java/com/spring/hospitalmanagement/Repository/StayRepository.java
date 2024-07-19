package com.spring.hospitalmanagement.Repository;


import com.spring.hospitalmanagement.Model.Stay;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StayRepository extends ListCrudRepository<Stay, Integer> {
}
