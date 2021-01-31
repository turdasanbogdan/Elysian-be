package turdasan.elysian.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import turdasan.elysian.interview.entity.Pharmacy;

import java.util.List;

public interface PharmaciesRepository extends JpaRepository<Pharmacy, Integer> {
    List<Pharmacy>  findAll();
    Pharmacy findById(int id);
    Pharmacy findByName(String name);
    List<Pharmacy> findByCity(String city);
}
