package com.spring.hospitalmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "affiliated_with")
public class Affiliated_with {

    @Id
    private Integer physician;
    private Integer department;
    private String primaryaffiliation;

    public Affiliated_with(Integer physician, Integer department, String primaryaffiliation) {
        this.physician = physician;
        this.department = department;
        this.primaryaffiliation = primaryaffiliation;
    }
    public Affiliated_with() {
    }
}
