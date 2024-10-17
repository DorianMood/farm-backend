package com.rshb.game.farm.model;

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
public class Farm {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column
    @Builder.Default
    private Integer balance = 100;

    @OneToMany(mappedBy = "farm", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bed> bedList = new ArrayList<>();

    @OneToMany(mappedBy = "farm", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Barns> barnsList = new ArrayList<>();

    @OneToMany(mappedBy = "farm", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InventoryItem> inventoryItemList;


}
