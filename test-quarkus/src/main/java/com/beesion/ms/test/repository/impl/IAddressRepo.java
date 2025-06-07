/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.repository.impl;

import com.beesion.ms.test.model.Address;
import java.util.List;


public interface IAddressRepo {
    void save(Address address);
    List<Address> findAll();
}
