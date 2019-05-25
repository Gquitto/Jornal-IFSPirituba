package com.gquitto.jornal.model.users.tables;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;

    private String name;

    private String email;

    private String password;

    private String role;
}
