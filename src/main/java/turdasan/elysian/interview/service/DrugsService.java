package turdasan.elysian.interview.service;

import turdasan.elysian.interview.entity.Drug;

import java.util.List;

public interface DrugsService {

    List<Drug> findAll();
    Drug findById(int id);
    Drug findByName(String name);


}
