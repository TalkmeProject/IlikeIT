package com.idglebik.ilikeit.dbo;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.idglebik.ilikeit.enumerated.Aligment;
import com.idglebik.ilikeit.enumerated.MainInLife;
import com.idglebik.ilikeit.enumerated.MainInPeople;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "LIFE_POSITION")
public class LIfePositionDbo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "ALIGMENT")
    private Aligment aligment;

    @Enumerated(EnumType.STRING)
    @Column(name = "MAIN_IN_LIFE")
    private MainInLife mainInLife;

    @Enumerated(EnumType.STRING)
    @Column(name = "MAIN_IN_PEOPLE")
    private MainInPeople mainInPeople;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JsonManagedReference
    private UserDbo user;
}