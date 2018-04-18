package hibernate;

import hibernate.shop.Price;
import hibernate.shop.Product;
import hibernate.shop.ProductRepository;
import hibernate.shop.ProductType;


import java.math.BigDecimal;
import java.util.Optional;


/**
 * Created by Lukasz on 27.09.2017.
 */
public class App {

    public static void main(String[] args) throws Exception {

        Product merc = new Product("Mercedes S", ProductType.CAR,
                new Price(new BigDecimal(500000), new BigDecimal(600000)));

        Product mercA = new Product("Mercedes A", ProductType.CAR,
                new Price(new BigDecimal(100000), new BigDecimal(120000)));

        Product smallCar = new Product("red Car", ProductType.CAR,
                new Price(new BigDecimal(30), new BigDecimal(34)));

        ProductRepository.saveProduct(merc);
        ProductRepository.saveProduct(mercA);

        Optional<Product> product1 = ProductRepository.findOneById(1L);
        Optional<Product> product2 = ProductRepository.findOneById(2L);
        Optional<Product> product3 = ProductRepository.findOneById(3L);

        System.out.println(product1.map(p -> p.getName()).orElse(""));
        System.out.println(product2.map(p -> p.getName()).orElse(""));
        System.out.println(product3.map(p -> p.getName()).orElse(""));

        Optional<Product> tryOptional = ProductRepository.findOneById(3L);
        if(toyOptional.isPresent()){
            Product toy = toyOptimal.get();
            toy.get
        }

    }
}
