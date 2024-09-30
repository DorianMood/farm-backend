package com.rshb.game.farm.model.animal;

import com.rshb.game.farm.model.FarmInventory;
import com.rshb.game.farm.model.plant.PlantKind;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnimalProduct {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "farm_inventory_id", nullable = false)
    private FarmInventory farmInventory;

    @Column
    private LocalDateTime landingTime;

    @Column
    @Builder.Default
    private Integer growthTime = 5;

    @Column
    private Integer profit;

}
