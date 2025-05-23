package com.example.dslist.domain.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId

    private BelongingPK id = new BelongingPK();

    private Integer position;


    public Belonging(){

    }

    public Belonging(Game game, GameList gameList, Integer position){
        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Belonging belonging)) return false;
        return Objects.equals(getId(), belonging.getId()) && Objects.equals(getPosition(), belonging.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPosition());
    }
}
