package turdasan.elysian.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import turdasan.elysian.interview.entity.Pharmacy;
import turdasan.elysian.interview.entity.Stock;
import turdasan.elysian.interview.service.StocksService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StocksRestController {

    private StocksService stocksService;

    @Autowired
    public StocksRestController(StocksService stocksService){
        this.stocksService = stocksService;
    }

    @GetMapping("/")
    public List<Stock> findAll(){ return stocksService.findAll(); }

    @GetMapping("/{drug_name}")
    public List<Pharmacy> findAllPhamrcies(@PathVariable String drug_name){
        List<Stock> stocks = stocksService.findAll();
        List<Pharmacy> pharmas = new ArrayList<>();
        stocks.stream().forEach(
                s -> {
                    if(s.getDrugs().getName().equals(drug_name)){
                        pharmas.add(s.getPharmacies());
                    }
                }
        );

        if(pharmas.size() == 0){
            throw new RuntimeException("no pharmas have drug " + drug_name);

        }

        return pharmas;
    }

    @GetMapping("/{city_name}/{drug_name}")
    public int findAllDrugs(@PathVariable String city_name, @PathVariable String drug_name ){

        List<Stock> stocks = stocksService.findAll();
//        stocks.stream().forEach(
//                s -> {
//                    if(s.getPharmacies().getCity().equals(city_name){
//                       if(s.getDrugs().getName().equals(drug_name)){
//                           total = total + s.getQuantity();
//                       }
//                    }
//                }
//        );
//
//        if(pharmas.size() == 0){
//            throw new RuntimeException("no pharmas have drug " + drug_name);
//
//        }
    int total = stocks.stream()
                    .filter(s -> s.getPharmacies().getCity().equals(city_name))
                    .filter(s -> s.getDrugs().getName().equals(drug_name))
                    .map(s -> s.getQuantity())
                    .reduce(0, Integer::sum);

        return total;
    }


}
