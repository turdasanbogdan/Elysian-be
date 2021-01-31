package turdasan.elysian.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import turdasan.elysian.interview.entity.Stock;
import turdasan.elysian.interview.service.StocksService;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StocksController {

    private StocksService stocksService;

    @Autowired
    public StocksController(StocksService stocksService){
        this.stocksService = stocksService;
    }

    @GetMapping("/")
    public List<Stock> findAll(){ return stocksService.findAll(); }

}
