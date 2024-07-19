package com.spring.hospitalmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "prescribes",schema = "public")
public class Prescribes {
    @Id
    private  Integer physician;
    private Integer patient;
    private  Integer medication;
    private String date;
    private  Integer appointment;
    private Integer dose;

    public Prescribes(Integer physician, Integer patient, Integer medication, String date, Integer appointment, Integer dose) {
        this.physician = physician;
        this.patient = patient;
        this.medication = medication;
        this.date = date;
        this.appointment = appointment;
        this.dose = dose;
    }

    public Prescribes() {

    }
}