package turdasan.elysian.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import turdasan.elysian.interview.entity.Drug;

import java.util.List;

public interface DrugsRepository extends JpaRepository<Drug, Integer> {
    List<Drug> findAll();
    Drug findById(int id);
    Drug findByName(String name);

}
