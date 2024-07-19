package com.spring.hospitalmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trained_in",schema = "public")
public class Trained_In {
    @Id
    private  Integer physician;
    private Integer treatment;
    private String certificationdata;

    public Trained_In(Integer physician, Integer treatment, String certificationdata, String certificationexpires) {
        this.physician = physician;
        this.treatment = treatment;
        this.certificationdata = certificationdata;
        this.certificationexpires = certificationexpires;
    }

    private  String certificationexpires;

    public Trained_In() {
    }
}