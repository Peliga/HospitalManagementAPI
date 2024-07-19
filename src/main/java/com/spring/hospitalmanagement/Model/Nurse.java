package com.spring.hospitalmanagement.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "nurse")
public class Nurse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer employeeid;
    private  String name;
    private  String position;
    private  String registered;
    private  Integer ssn;
}