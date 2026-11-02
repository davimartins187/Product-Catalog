package souza.projetect.productcatalog.service;

import org.springframework.stereotype.Service;
import souza.projetect.productcatalog.domain.Product;
import souza.projetect.productcatalog.dto.ProductDto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        Product product1 = new Product("Computador", 200.00, 4);
        Product product2 = new Product("Celular", 100.00, 2);
        Product product3 = new Product("Televisão", 300.00, 3);

        this.products.add(product1);
        this.products.add(product2);
        this.products.add(product3);
    }

    public List<Product> findAll(){
        return products;
    }

    public Product findById(UUID id){
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().
                orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Product createProduct(ProductDto productDto) {
        Product novoProduto = Product.builder()
                .id(UUID.randomUUID())
                .name(productDto.getName())
                .price(productDto.getPrice())
                .stock(productDto.getStock())
                .build();

        products.add(novoProduto);
        return novoProduto;
    }

    public void delete(UUID id){
        boolean removed = products.removeIf(product -> product.getId().equals(id));

        if (!removed){
            throw new RuntimeException("Produto não encontrado");
        }
    }
}