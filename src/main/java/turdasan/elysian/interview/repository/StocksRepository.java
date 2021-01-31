package turdasan.elysian.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import turdasan.elysian.interview.entity.Stock;

import java.util.List;

public interface StocksRepository extends JpaRepository<Stock, Integer> {
    List<Stock> findAll();
}
