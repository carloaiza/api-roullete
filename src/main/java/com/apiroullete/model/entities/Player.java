package com.apiroullete.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Player {

    @Id
    @Column(name = "code")
    private int code;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "coins")
    private int coins;
    @Basic
    @Column(name = "state")
    private boolean state;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return code == player.code && coins == player.coins && state == player.state && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, coins, state);
    }
}
