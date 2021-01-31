package turdasan.elysian.interview.service;

import turdasan.elysian.interview.entity.Pharmacy;

import java.util.List;

public interface PharmaciesService {
    List<Pharmacy> findAll();
    Pharmacy findById(int id);
    Pharmacy findByName(String name);
    List<Pharmacy> findByCity(String city);
}
