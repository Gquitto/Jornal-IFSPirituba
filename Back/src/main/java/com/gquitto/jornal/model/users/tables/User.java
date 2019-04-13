package com.gquitto.jornal.model.users.tables;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    private long id;

    private String name;

    private String email;

    private String password;

    private String bio;







}
