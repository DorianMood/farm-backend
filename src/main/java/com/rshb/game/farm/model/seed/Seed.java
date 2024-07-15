package com.rshb.game.farm.model.seed;

import com.rshb.game.farm.model.Bed;
import com.rshb.game.farm.model.plant.PlantKind;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "seeds")
public class Seed {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @OneToOne(mappedBy = "plant",cascade = CascadeType.ALL)
    private Bed bed;

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    private SeedKind seedKind;
}
