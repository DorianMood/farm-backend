package com.rshb.game.farm.model;

import com.rshb.game.farm.model.seed.Seed;
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
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "seed_id")
    private Seed seed;
}
