package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column private String email;
    @Column private String password;
    @Column private String phone;
    @Column private String address;
}
