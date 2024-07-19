package com.spring.hospitalmanagement.Repository;

import com.spring.hospitalmanagement.Model.Room;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends ListCrudRepository<Room, Integer> {
}
