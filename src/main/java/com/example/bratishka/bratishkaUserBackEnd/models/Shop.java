package com.example.bratishka.bratishkaUserBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "link")
    private String link;

    @Column(name = "name")
    private String name;

    @Column(name = "link_ym")
    private String linkYm;

    @Column(name = "phone")
    private String phone;

    @Column(name = "link_tg")
    private String linkTg;

    @JsonIgnore
    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Barber> barbers;

    @ManyToOne
    @JoinColumn(name = "city_id")
    @Cascade(org.hibernate.annotations.CascadeType.MERGE)
    private City city;

    public Shop() {
    }

    public Shop(String link, String name, String linkYm, String phone, String linkTg, City city) {
        this.link = link;
        this.name = name;
        this.linkYm = linkYm;
        this.phone = phone;
        this.linkTg = linkTg;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkYm() {
        return linkYm;
    }

    public void setLinkYm(String linkYm) {
        this.linkYm = linkYm;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLinkTg() {
        return linkTg;
    }

    public void setLinkTg(String linkTg) {
        this.linkTg = linkTg;
    }

    public List<Barber> getBarbers() {
        return barbers;
    }

    public void setBarbers(List<Barber> barbers) {
        this.barbers = barbers;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
