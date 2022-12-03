package com.example.rondobackend.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "security_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "wholesale_customer_user",
            joinColumns =
                    {@JoinColumn(name = "wholesale_customer_id", referencedColumnName = "id")
                    },
            inverseJoinColumns =
                    {@JoinColumn(name = "security_user_id", referencedColumnName = "id")
                    })

    private WholesaleCustomer wholesaleCustomer;

    @JsonIgnore
    private String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    protected User() {
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns
        = @JoinColumn(name = "user_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id",
                    referencedColumnName = "id"))

    private List<Role> roles;
}
