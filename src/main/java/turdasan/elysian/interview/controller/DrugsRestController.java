package turdasan.elysian.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import turdasan.elysian.interview.entity.Drug;
import turdasan.elysian.interview.service.DrugsService;

import java.util.List;

@RestController
@RequestMapping("/drugs")
public class DrugsRestController {

    private DrugsService drugsService;

    @Autowired
    public DrugsRestController(DrugsService drugsService){
        this.drugsService = drugsService;
    }

    @GetMapping("/")
    public List<Drug>  findAll(){
        return drugsService.findAll();
    }

    @GetMapping("/id/{id}")
    public Drug findByID(@PathVariable int id){
        Drug drug = drugsService.findById(id);

        if(drug == null){
            throw  new RuntimeException("Drug id not found" + id);
        }

        return drug;
    }

    @GetMapping("/name/{name}")
    public Drug findByName(@PathVariable String name){
        Drug drug = drugsService.findByName(name);

        if(drug == null){
            throw new RuntimeException("Drug name not found" + name);
        }

        return drug;
    }

}
