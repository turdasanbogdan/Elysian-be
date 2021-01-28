package turdasan.elysian.interview.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import turdasan.elysian.interview.entity.Drugs;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.*;

@Repository
public class DrugsDaoImpl implements DrugsDao{

    private EntityManager entityManager;

    @Autowired
    public DrugsDaoImpl(EntityManager entityManager){
        entityManager = entityManager;
    }

    @Override
    public List<Drugs> getAll() {

        Query query = entityManager.createQuery("");

        List<Drugs> drugs = query.getResultList();

        return drugs;
    }

    @Override
    public Drugs findByID(int id) {

        Drugs drug = entityManager.find(Drugs.class, id);

        return drug;
    }

    @Override
    public List<Drugs> findByName(String name){

        List<Drugs> finalDrugs = new LinkedList<Drugs>();
        this.getAll().forEach(d -> {
            if(d.getName().equals(name)){
                finalDrugs.add(d);
            }
        });

        return finalDrugs;
    }
}
