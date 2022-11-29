package com.example.rondobackend.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class WholesaleCostumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cvrNumber;
    private String mail;
    private String phoneNumber;
    private String userName;
    private String password;

    public WholesaleCostumer(Long id, String name, String cvrNumber, String mail, String phoneNumber, String userName, String password) {
        this.id = id;
        this.name = name;
        this.cvrNumber = cvrNumber;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
    }
}
