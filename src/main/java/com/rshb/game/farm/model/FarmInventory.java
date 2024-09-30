package com.rshb.game.farm.model;

import com.rshb.game.farm.model.animal.AnimalProduct;
import com.rshb.game.farm.model.plant.Plant;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FarmInventory {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @Column
    @Builder.Default
    private Integer balance = 100;

    @OneToMany(mappedBy = "farmInventory", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Plant> plantList;

    @OneToMany(mappedBy = "farmInventory", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AnimalProduct> animalProductList;

}
