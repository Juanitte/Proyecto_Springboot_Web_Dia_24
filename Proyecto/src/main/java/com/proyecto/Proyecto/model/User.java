package com.proyecto.Proyecto.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name = "name")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Column(name = "age")
    @JdbcTypeCode(SqlTypes.INTEGER)
    private int age;

    @Column(name = "email")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String email;

    @ManyToMany
    @JoinTable(name = "users_games",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "games_code"))
    private Set<Game> games = new LinkedHashSet<>();

}
