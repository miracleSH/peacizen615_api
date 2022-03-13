package com.peacizen.peacizen.entity;

import com.peacizen.peacizen.controller.dto.UserRegisterRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;
    private String address;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;


    public enum Status{
        ACTIVE, NON_ACTIVE;
    }

    public User(UserRegisterRequest request){
        this.name = request.getName();
        this.password = request.getPassword();
        this.phoneNumber = request.getPhoneNumber();
        this.address = request.getAddress();
        this.email = request.getEmail();
    }

    public void setStatus(Status status){
        this.status = status;
    }
}
