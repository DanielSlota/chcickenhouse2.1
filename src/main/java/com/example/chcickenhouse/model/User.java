package com.example.chcickenhouse.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickName;

    private String firstName;

    private LocalDateTime createdOn;

    @PrePersist
    public  void prePersist(){
        createdOn = LocalDateTime.now();
    }


}
