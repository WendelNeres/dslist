package com.example.dslist.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Entity
@Table(name = "tb_game")

public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String title;
    @Column(name = "game_year",nullable = false)
    private Integer year;
    @Column( nullable = false)
    private String genre;
    @Column(nullable = false)
    private String platforms;
    @Column(unique = true, nullable = false)
    private String imgUrl;
    @Column(nullable = false)
    private Double score;
    private String shortDescription;
    private String longDescription;


    public Games(){}

    public Games(long id, String title, Integer year, String genre, String platforms, String imgUrl, Double score, String shortDescription, String longDescription){
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.score = score;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Games games)) return false;
        return getId() == games.getId() && Objects.equals(title, games.title) && Objects.equals(year, games.year) && Objects.equals(genre, games.genre) && Objects.equals(platforms, games.platforms) && Objects.equals(imgUrl, games.imgUrl) && Objects.equals(score, games.score) && Objects.equals(shortDescription, games.shortDescription) && Objects.equals(longDescription, games.longDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), title, year, genre, platforms, imgUrl, score, shortDescription, longDescription);
    }
}
