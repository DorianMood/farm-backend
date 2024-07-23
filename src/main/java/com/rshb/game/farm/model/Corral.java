package com.rshb.game.farm.model;

import com.rshb.game.farm.model.animal.Animal;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@Entity
@Table(name = "corrals")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Corral {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "animal_id")
    private Animal animal;

}
