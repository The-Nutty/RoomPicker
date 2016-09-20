package com.tomhazell.roompicker.database;

import javax.persistence.*;

/**
 * Created by Tom Hazell on 20/09/2016.
 */
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(updatable = false)
    private Integer ID;

    private String name;

    private Integer randomNum;

    private String IP;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(Integer randomNum) {
        this.randomNum = randomNum;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
}
