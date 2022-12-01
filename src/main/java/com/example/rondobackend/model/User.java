package com.example.rondobackend.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "engros_user",
            joinColumns =
                    {@JoinColumn(name = "engros_id", referencedColumnName = "id")
                    },
            inverseJoinColumns =
                    {@JoinColumn(name = "user_id", referencedColumnName = "id")
                    })

    private Engros engros;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
