package com.fernandopedro.simplewebapp.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator( name = "increment", strategy = "increment")
    private Long id;

    private String name;
    private Integer carsQuantity;

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

    public Integer getCarsQuantity() {
        return carsQuantity;
    }

    public void setCarsQuantity(Integer carsQuantity) {
        this.carsQuantity = carsQuantity;
    }
}
