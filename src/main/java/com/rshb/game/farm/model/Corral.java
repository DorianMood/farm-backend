package com.rshb.game.farm.model;

import com.rshb.game.farm.model.animal.Animal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Data
@Table(name = "corrals")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Corral {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private User userId;

    @OneToOne
    @JoinColumn(name = "id")
    private Animal animalId;

}
