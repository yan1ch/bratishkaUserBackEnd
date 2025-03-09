package com.example.bratishka.bratishkaUserBackEnd.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "ad")
@EqualsAndHashCode
@ToString
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Link can not be null")
    @Column(name = "link", nullable = false)
    private String link;

    @NotNull(message = "number can not be null")
    @Column(name = "number", nullable = false)
    private int number;

    public Ad() {
    }

    public Ad(String link, int number) {
        this.link = link;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull(message = "Link can not be null") String getLink() {
        return link;
    }

    public void setLink(@NotNull(message = "Link can not be null") String link) {
        this.link = link;
    }

    @NotNull(message = "number can not be null")
    public int getNumber() {
        return number;
    }

    public void setNumber(@NotNull(message = "number can not be null") int number) {
        this.number = number;
    }
}
