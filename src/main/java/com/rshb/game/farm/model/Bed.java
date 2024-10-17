package com.rshb.game.farm.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "beds")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bed {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "farm_id",nullable = false)
    private Farm farm;

    @OneToOne(mappedBy = "bed",cascade = CascadeType.ALL, orphanRemoval = true)
    private InventoryItem inventoryItem;
}
