package com.rshb.game.farm.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@Entity
@Table(name = "barns")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Barns {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "farm_id",nullable = false)
    private Farm farm;

    @OneToOne(mappedBy = "barn",cascade = CascadeType.ALL, orphanRemoval = true)
    private InventoryItem inventoryItem;

}
