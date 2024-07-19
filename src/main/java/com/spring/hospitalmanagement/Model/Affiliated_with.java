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
    private Integer physicial;
    private Integer department;
    private String primaryaffiliation;

    public Affiliated_with(Integer physicial, Integer department, String primaryaffiliation) {
        this.physicial = physicial;
        this.department = department;
        this.primaryaffiliation = primaryaffiliation;
    }
    public Affiliated_with() {
    }
}
