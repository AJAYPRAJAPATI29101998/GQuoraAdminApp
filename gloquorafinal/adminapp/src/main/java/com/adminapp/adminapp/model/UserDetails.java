package com.adminapp.adminapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDetails {


    private  int userId;


    private String name;

    private String username;

    private String email;





    private Address  address;

    private String phone;

    private Company company;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "geo_id", referencedColumnName = "gid")
//    private  Geo geo;

}
