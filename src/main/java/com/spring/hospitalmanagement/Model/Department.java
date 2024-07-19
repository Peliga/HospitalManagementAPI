package com.spring.hospitalmanagement.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "department", schema = "public")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Integer department_id;
    @Column(name = "name")
    private  String name;
    @Column(name = "head")
    private Integer head;

    public Department(Integer department_id, String name, Integer head) {
        this.department_id = department_id;
        this.name = name;
        this.head = head;
    }


    public Department() {
    }


}