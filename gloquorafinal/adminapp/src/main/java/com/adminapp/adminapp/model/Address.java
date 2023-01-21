package com.adminapp.adminapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {


    private int addId;

   private String street;


   private String city;


    private  Geo geo;

//    @OneToOne(mappedBy = "address")
//    private UserDetails userDetails;

}
