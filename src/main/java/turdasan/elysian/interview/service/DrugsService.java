package turdasan.elysian.interview.service;

import turdasan.elysian.interview.entity.Drug;

import java.util.List;

public interface DrugsService {

    public List<Drug> findAll();
    public Drug findById(int id);
    public Drug findByName(String name);


}
