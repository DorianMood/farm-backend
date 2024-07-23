package com.rshb.game.farm.model.seed;

import com.rshb.game.farm.model.Bed;
import com.rshb.game.farm.model.plant.PlantKind;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "seeds")
public class Seed {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "bed_id")
    private Bed bed;

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    private SeedKind seedKind;

    @Column
    private LocalDateTime landingTime;

    @Column
    @Builder.Default
    private Integer growthTime = 2;

    @Column
    private Integer profit;
}
