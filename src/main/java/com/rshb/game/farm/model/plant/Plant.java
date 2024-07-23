package com.rshb.game.farm.model.plant;

import com.rshb.game.farm.model.Bed;
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
@Table(name = "plants")
public class Plant {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column
    private LocalDateTime landingTime;

    @Enumerated(EnumType.STRING)
    private PlantKind plantKind;

    @Column
    @Builder.Default
    private Integer growthTime = 5;

    @Column
    private Integer profit;
}
