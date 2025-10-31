package com.ftwitter.wangdat.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "first_name")
  private String firstName; 

  @Column(name = "last_name")
  private String lastName;

  @Column(unique = true)
  private String email;

  private String phone;

  @Column(name = "dob")
  private Date dateOfBirth;

  @Column(unique = true)
  private String username;

  private String password;
}
