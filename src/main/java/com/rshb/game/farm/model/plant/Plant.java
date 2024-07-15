package com.rshb.game.farm.model.plant;

import com.rshb.game.farm.model.Bed;
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
@Table(name = "plants")
public class Plant {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @OneToOne(mappedBy = "id",cascade = CascadeType.ALL)
    private Bed bed;

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    private PlantKind plantKind;
}
