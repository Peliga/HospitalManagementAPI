package com.spring.hospitalmanagement.Repository;

import com.spring.hospitalmanagement.Model.Room;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Repository
public class RoomRepository{
    private  final JdbcClient client;

    public RoomRepository(JdbcClient client) {
        this.client = client;
    }

    public List<Room> findAll(){
        return  client.sql("select * from public.room").query(Room.class).list();
    }
    public void save(Room room){
       var created = client.sql("insert into public.room(roomnumber,roomtype,blockfloor, " +
                                            "blockcode,unavailable) Values (?,?,?,?,?)").params(List.of(room.getRoomnumber(),
                                            room.getRoomtype(),room.getBlockfloor(),room.getBlockcode(),room.getUnavailable())).update();

        Assert.state(created == 1, "Failed to create another room");
    }
    public Optional<Room> findById(Integer roomnumber){
        String sql = "Select * from public.room where roomnumber = :roomnumber";
        return client.sql(sql).param("roomnumber",roomnumber).query(Room.class).optional();
    }

    public void update(Room room, Integer roomnumber){
        String sql = "Update public.room set roomtype = ?, blockfloor = ?," +
                "blockcode = ?, unavailable = ? where roomnumber = ?";
        var updated = client.sql(sql).params(List.of(room.getRoomtype(),room.getBlockfloor(),room.getBlockcode(),room.getUnavailable(),roomnumber)).update();

        Assert.state(updated == 1, "Update room number : "+roomnumber + "Failed");
    }

    public void Delete(Integer room_number){
        String sql = "Delete from public.room where roomnumber = :roomnumber";
        var deleted =  client.sql(sql).param("roomnumber",room_number).update();

        Assert.state(deleted == 1, "Failed to delete room number "+room_number);

    }
}
