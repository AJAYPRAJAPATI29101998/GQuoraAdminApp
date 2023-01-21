package com.userdetails.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "geo")

public class Geo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gid")
    private int gepId;


private  String lat;




private  String lng;

//    @OneToOne(mappedBy = "geo")
//    private UserDetails userDetails;

}
