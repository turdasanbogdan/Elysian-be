package turdasan.elysian.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import turdasan.elysian.interview.entity.Drugs;
import turdasan.elysian.interview.service.DrugsService;

import java.util.List;

public class DrugsRestController {
    private DrugsService drugsService;

    @Autowired
    public DrugsRestController(DrugsService drugsService){
        this.drugsService = drugsService;
    }

    @GetMapping("/drugs")
    public List<Drugs>  getAll(){
        return drugsService.getAll();
    }

    @GetMapping("/drugs/{id}")
    public Drugs findByID(@PathVariable int id){
        Drugs drug = drugsService.findByID(id);

        if(drug == null){
            throw  new RuntimeException("Drug id not found" + id);
        }

        return drug;
    }

    @GetMapping("/drugs/{name}")
    public List<Drugs> findByName(@PathVariable String name){
        List<Drugs> drugs = drugsService.findByName(name);

        if(drugs == null){
            throw new RuntimeException("Drug name not found" + name);
        }

        return drugs;
    }

}
