package com.userdetails.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int userId;


    private String name;

    private String username;

    private String email;




    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address  address;

    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", referencedColumnName = "cid")
    private Company company;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "geo_id", referencedColumnName = "gid")
//    private  Geo geo;

}
