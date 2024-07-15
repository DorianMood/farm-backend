package com.rshb.game.farm.model.animal;

import com.rshb.game.farm.model.Corral;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @OneToOne(mappedBy = "animal_id",cascade = CascadeType.ALL)
    private Corral corralId;

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    private AnimalKind animalKind;
}
