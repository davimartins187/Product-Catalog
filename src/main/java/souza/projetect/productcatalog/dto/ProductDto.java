package souza.projetect.productcatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class ProductDto {
    private String name;
    private double price;
    private Integer stock;
}