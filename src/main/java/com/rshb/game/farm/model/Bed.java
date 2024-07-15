package com.rshb.game.farm.model;

import com.rshb.game.farm.model.plant.Plant;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "beds")
public class Bed {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private User userId;

    @OneToOne
    @JoinColumn(name = "id")
    private Plant plant;
}
