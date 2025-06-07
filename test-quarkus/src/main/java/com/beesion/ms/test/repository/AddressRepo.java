/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.repository;

import com.beesion.ms.test.model.Address;
import com.beesion.ms.test.repository.impl.IAddressRepo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class AddressRepo implements IAddressRepo {
    
    @Inject
    EntityManager em;
    
    @Override
    @Transactional
    public void save(Address address) {
        em.persist(address);
    }
    
    @Override
    public List<Address> findAll() {
        return em.createQuery("SELECT a FROM Address a", Address.class).getResultList();
    }
    
    @Override
    public List<Address> findByPersonId(Long personId) {
        return em.createQuery("SELECT a FROM Address a WHERE a.person.id = :personId", Address.class)
                .setParameter("personId", personId)
                .getResultList();
    }

    
}
