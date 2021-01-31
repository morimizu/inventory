package com.benjaminrperry.inventory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @SequenceGenerator(name = "USER_SEQ",allocationSize = 25)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "USER_SEQ")
    private Long userID;
    private String username;
    private String email;
    @Embedded
    private FullName fullName;
    private String password;

}
