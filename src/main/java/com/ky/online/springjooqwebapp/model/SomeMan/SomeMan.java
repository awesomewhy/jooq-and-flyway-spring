package com.ky.online.springjooqwebapp.model.SomeMan;

import jakarta.persistence.*;
import lombok.*;
import org.jooq.impl.QOM;

@Entity
@Table(name = "some_man")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SomeMan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private short age;
}
