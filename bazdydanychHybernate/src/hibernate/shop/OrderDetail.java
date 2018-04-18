package hibernate.shop;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


@Entity
@NoArgsConstructor
@Data
@Builder

public class OrderDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Embedded
    Price price;

    BigDecimal amount;
    // TODO add relation
    Product product;
}
