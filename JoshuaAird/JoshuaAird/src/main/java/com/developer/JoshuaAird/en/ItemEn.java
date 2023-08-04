package com.developer.JoshuaAird.en;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mt_item")
public class ItemEn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itm_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

 
    public ItemEn() {
    }

    public ItemEn(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setGender(String description) {
        this.description = description;
    }

    
}