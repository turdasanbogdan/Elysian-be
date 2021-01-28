package turdasan.elysian.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class ElysianBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElysianBeApplication.class, args);
    }

}
