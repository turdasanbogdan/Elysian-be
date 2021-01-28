package turdasan.elysian.interview.service;

import turdasan.elysian.interview.entity.Drugs;

import java.util.List;

public interface DrugsService {

    public List<Drugs> getAll();
    public Drugs findByID(int id);
    public List<Drugs> findByName(String name);


}
