package turdasan.elysian.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import turdasan.elysian.interview.entity.Pharmacy;
import turdasan.elysian.interview.repository.PharmaciesRepository;

import java.util.List;

@Service
public class PharmaciesSerivceImpl implements PharmaciesService{

    @Autowired
    private PharmaciesRepository pharmaRepo;

    @Override
    public List<Pharmacy> findAll() {
        return pharmaRepo.findAll();
    }

    @Override
    public Pharmacy findById(int id) {
        return pharmaRepo.findById(id);
    }

    @Override
    public Pharmacy findByName(String name) {
        return pharmaRepo.findByName(name);
    }

    @Override
    public List<Pharmacy> findByCity(String city) {
        return pharmaRepo.findByCity(city);
    }
}
