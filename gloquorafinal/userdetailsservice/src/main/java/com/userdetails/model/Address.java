package com.userdetails.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int addId;

   private String street;


   private String city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "geo_id", referencedColumnName = "gid")
    private  Geo geo;

//    @OneToOne(mappedBy = "address")
//    private UserDetails userDetails;

}
