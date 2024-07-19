package com.spring.hospitalmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "stay",schema = "public")
public class Stay {
    @Id
    private  Integer stayid;
    private String patient_room;
    private  String start_time;
    private  String end_time;

    public Stay(Integer stayid, String patient_room, String start_time, String end_time) {
        this.stayid = stayid;
        this.patient_room = patient_room;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Stay() {
    }
}