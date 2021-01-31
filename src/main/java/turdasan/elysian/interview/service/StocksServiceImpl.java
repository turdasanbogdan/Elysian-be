package turdasan.elysian.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import turdasan.elysian.interview.entity.Stock;
import turdasan.elysian.interview.repository.StocksRepository;

import java.util.List;

@Service
public class StocksServiceImpl implements StocksService {

    @Autowired
    private StocksRepository stocksRepository;


    @Override
    public List<Stock> findAll() {
        return stocksRepository.findAll();
    }
}
