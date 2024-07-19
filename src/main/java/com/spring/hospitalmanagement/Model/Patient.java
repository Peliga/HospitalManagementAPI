package com.spring.hospitalmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "patient",schema = "public")
public class Patient {

    @Id
    private  Integer ssn;
    private  String name;
    private String  address;
    private String phone;
    private Integer insuranceid;
    private Integer pcp;

    public Patient(Integer ssn, String name, String address, String phone, Integer insuranceid, Integer pcp) {
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.insuranceid = insuranceid;
        this.pcp = pcp;
    }

    public Patient() {
    }


}