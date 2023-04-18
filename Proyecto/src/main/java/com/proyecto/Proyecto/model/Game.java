package com.proyecto.Proyecto.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name="games")
public class Game implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int code;

    @Column(name = "name")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Column(name = "genre")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String genre;

    @Column(name = "price")
    @JdbcTypeCode(SqlTypes.DOUBLE)
    private double price;

    @ManyToMany(mappedBy = "games")
    private Set<User> users = new LinkedHashSet<>();

}
