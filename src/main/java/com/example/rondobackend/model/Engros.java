package com.example.rondobackend.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "engros")
public class Engros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cvrNumber;
    private String mail;
    private String phoneNumber;

    @OneToOne(mappedBy = "engros")
    private User user;




}
