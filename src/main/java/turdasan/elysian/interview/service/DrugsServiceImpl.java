package turdasan.elysian.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import turdasan.elysian.interview.dao.DrugsDao;
import turdasan.elysian.interview.entity.Drug;
import turdasan.elysian.interview.repository.DrugsRepository;

import java.util.List;

@Service
public class DrugsServiceImpl implements DrugsService {

    @Autowired
    private DrugsRepository drugsRepo;

    @Override
    public List<Drug> findAll() {
        return drugsRepo.findAll();
    }

    @Override
    public Drug findById(int id) {
        return drugsRepo.findById(id);
    }

    @Override
    public Drug findByName(String name) {
        return drugsRepo.findByName(name);
    }
}
