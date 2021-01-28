package turdasan.elysian.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import turdasan.elysian.interview.dao.DrugsDao;
import turdasan.elysian.interview.entity.Drugs;

import java.util.List;

@Service
public class DrugsServiceImpl implements DrugsService {

    private DrugsDao drugsDao;

    @Autowired
    public DrugsServiceImpl(DrugsDao drugsDao){
        this.drugsDao = drugsDao;
    }

    @Override
    public List<Drugs> getAll() {
        return drugsDao.getAll();
    }

    @Override
    public Drugs findByID(int id) {
        return drugsDao.findByID(id);
    }

    @Override
    public List<Drugs> findByName(String name) {
        return drugsDao.findByName(name);
    }
}
