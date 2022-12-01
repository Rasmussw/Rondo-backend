package com.example.rondobackend.model.login;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
