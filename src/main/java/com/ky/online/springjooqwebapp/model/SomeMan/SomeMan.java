package com.ky.online.springjooqwebapp.model.SomeMan;

import jakarta.persistence.*;
import lombok.*;
import org.jooq.impl.QOM;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeMan someMan = (SomeMan) o;
        return age == someMan.age && Objects.equals(id, someMan.id) && Objects.equals(name, someMan.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "SomeMan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
