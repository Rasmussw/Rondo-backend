package com.example.rondobackend.model.wholesalecustomer;
import com.example.rondobackend.model.order.StandardOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class WholesaleCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String cvrNumber;
    private String customerMail;
    private String phoneNumber;


    private String username;
    private String password;

    @OneToOne
    private StandardOrder standardOrder;

}
