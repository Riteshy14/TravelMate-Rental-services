package com.TravelMate.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="user")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {


      @Id
      private String userId;
      @Column(name="User_name")
      private String username;

      @Column(unique = true, nullable = false)
      private String email;
      private String password;
      @Column(length = 1000)
      private String about;
      private String profilePic;

      private String phoneNumber;
      private String AdharNumber;

      //information
      private boolean isActive=false;
      private boolean emailVerified=false;
      private boolean phoneVerified=false;

      //self, google, facebook, github

      @Enumerated(EnumType.STRING)
      private loginProvider loginBy=loginProvider.SELF;
      private String loginId;
      

      @ElementCollection(fetch = FetchType.EAGER)
@CollectionTable(                                     // it will joins the roles with current tables primary key
name = "user_roles",joinColumns = @JoinColumn(name = "userId"))
      @Column(name = "role")
      @Enumerated(EnumType.STRING)
      Set<Role> roles=new HashSet<>();



}
