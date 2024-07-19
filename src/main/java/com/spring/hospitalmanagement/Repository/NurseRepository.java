package com.spring.hospitalmanagement.Repository;

import com.spring.hospitalmanagement.Model.Nurse;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NurseRepository {

    private final JdbcClient client;

    public NurseRepository(JdbcClient client) {
        this.client = client;
    }

    public List<Nurse> findAll(){
        String sql = "SELECT * FROM public.nurse";
        return client.sql(sql).query(Nurse.class).list();
    }
}
