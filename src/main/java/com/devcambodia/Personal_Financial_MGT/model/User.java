package com.devcambodia.Personal_Financial_MGT.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_user")
@Getter
@Setter
public class User {
    private Long id;
    private String username;
    private String password;
}
