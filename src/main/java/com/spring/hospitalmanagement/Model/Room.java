package com.spring.hospitalmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

@Getter
@Setter
@Entity
@Table(name = "room",schema = "public")
public class Room {

    @Id
    private Integer roomnumber;
    private  String roomtype;
    private  Integer blockfloor;
    private  Integer blockcode;
    private String unavailable;

    public Room(Integer roomnumber, String roomtype, Integer blockfloor, Integer blockcode, String unavailable) {
        this.roomnumber = roomnumber;
        this.roomtype = roomtype;
        this.blockfloor = blockfloor;
        this.blockcode = blockcode;
        this.unavailable = unavailable;
    }

    public Room() {
    }

}