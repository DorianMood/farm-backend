package com.rshb.game.farm.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Builder
@Table(name = "shop_items")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShopItem {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column
    private Integer harvestTime;

    @Column
    private Integer price;

    @Column
    private String picture;

    @Column
    private String content;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column
    private Double sellMultiple;
}
