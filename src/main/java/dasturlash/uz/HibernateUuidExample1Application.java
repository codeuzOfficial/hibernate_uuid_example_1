package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class HibernateUuidExample1Application {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(HibernateUuidExample1Application.class, args);


    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            ProductEntity product = new ProductEntity();
            product.setName("Paypoq");
            product.setPrice(5600.0);
            product.setCompanyName("Uchar paypoqlar");
            product.setCreatedDate(LocalDateTime.now());
            productRepository.save(product);
        };
    }


}
