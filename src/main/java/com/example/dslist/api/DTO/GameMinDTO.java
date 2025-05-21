package com.example.dslist.api.DTO;


import com.example.dslist.domain.entities.Game;
import com.example.dslist.projections.GameMinProjection;
import org.springframework.beans.BeanUtils;

public class GameMinDTO {




    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public GameMinDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }

    public GameMinDTO(GameMinProjection gameMinProjection){
        this.id = gameMinProjection.getId();
        this.year = gameMinProjection.getYear();
        this.title = gameMinProjection.getTitle();
        this.shortDescription = gameMinProjection.getShortDescription();
        this.imgUrl = gameMinProjection.getImgUrl();
    }

}
