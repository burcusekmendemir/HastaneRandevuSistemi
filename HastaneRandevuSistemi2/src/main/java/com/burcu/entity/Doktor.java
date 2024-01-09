package com.burcu.entity;


import com.burcu.utility.enums.Unvan;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbldoktor")
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "brans_id")
    Long bransId;
    String ad;
    String adres;
    String telefon;
    @Enumerated
    Unvan unvan;

}
