package com.example.demodockerspring.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tblStudent")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
}
