package com.petstagram.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User extends Time{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Character useyn;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Board> boardList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Friend> friendList = new ArrayList<>();

}
