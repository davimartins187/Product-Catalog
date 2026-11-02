package souza.projetect.productcatalog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Product {
    private UUID id;
    private String name;
    private double price;
    private Integer stock;

    public Product(String name, double price, Integer stock){
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}