package com.adminapp.adminapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data


public class Geo {


    private int gepId;


private  String lat;




private  String lng;

//    @OneToOne(mappedBy = "geo")
//    private UserDetails userDetails;

}
