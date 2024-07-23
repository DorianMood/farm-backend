package com.rshb.game.farm.model.animal;

import com.rshb.game.farm.model.Corral;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "corral_id")
    private Corral corral;

    @Column
    private String description;

    @Column
    private LocalDateTime landingTime;

    @Enumerated(EnumType.STRING)
    private AnimalKind animalKind;

    @Column
    @Builder.Default
    private Integer growthTime = 10;

    @Column
    private Integer fixedProfit;
}
