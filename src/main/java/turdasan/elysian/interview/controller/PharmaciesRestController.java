package turdasan.elysian.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import turdasan.elysian.interview.entity.Pharmacy;
import turdasan.elysian.interview.service.PharmaciesService;

import java.util.List;

@RestController
@RequestMapping("/pharmacies")
public class PharmaciesRestController {

    @Autowired
    private PharmaciesService pharmaService;

    @GetMapping("/")
    public List<Pharmacy> findAll(){ return pharmaService.findAll(); }

    @GetMapping("/id/{id}")
    public Pharmacy findById(@PathVariable int id){

        Pharmacy pharmacy = pharmaService.findById(id);

        if(pharmacy == null){
            throw new RuntimeException("Pharma id not found " + id);
        }
        return pharmacy;
    }

    @GetMapping("/name/{name}")
    public Pharmacy findByName(@PathVariable String name){

        Pharmacy pharmacy = pharmaService.findByName(name);

        if(pharmacy == null){
            throw new RuntimeException("Pharma name not found " + name);
        }
        return pharmacy;
    }

    @GetMapping("/city/{city}")
    public List<Pharmacy> findByCity(@PathVariable String city){

        List<Pharmacy> pharmacy = pharmaService.findByCity(city);

        if(pharmacy == null){
            throw new RuntimeException("Pharma city not found " + city);
        }
        return pharmacy;
    }

}
