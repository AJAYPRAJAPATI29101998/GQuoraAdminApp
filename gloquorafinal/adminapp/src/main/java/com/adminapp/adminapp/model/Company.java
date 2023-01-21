package com.adminapp.adminapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company {

    private int companyId;
   private String name;
    private String location;

}
