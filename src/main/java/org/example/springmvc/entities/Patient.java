package org.example.springmvc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Getter  // or @Data (setter , getter , NoArgsConst..)
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
}
