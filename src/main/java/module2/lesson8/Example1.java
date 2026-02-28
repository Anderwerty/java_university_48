package module2.lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static module2.lesson8.ProductType.A;
import static module2.lesson8.ProductType.B;
import static module2.lesson8.ProductType.C;

public class Example1 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                null,
                new Product(A, 10),
                new Product(B, 11),
                new Product(B, 100),
                new Product(A, 1),
                new Product(C, 1),
                new Product(null, 0)
        );

        // 1) all products not null and with type not null
        List<Product> notNullProducts = products.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getProductType() != null)
                .collect(Collectors.toList());
        System.out.println(notNullProducts);
//                .toList();

        //2)
        Map<ProductType, Integer> productTypeToNumber = products.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getProductType() != null)
                .collect(Collectors.toMap(
                        Product::getProductType, // (p) ->  return p.getProductType()
                        Product::getNumberOfItems,// (p) ->  return p.getNumberOfItems()
                        Integer::sum        // (a,b) -> a+b
                ));

        productTypeToNumber.forEach((k, v) ->
                System.out.println(k + "=" + v));
    }
}


class Product {
    private final ProductType productType;
    private final int numberOfItems;

    public Product(ProductType productType, int numberOfItems) {
        this.productType = productType;
        this.numberOfItems = numberOfItems;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }


    @Override
    public String toString() {
        return "{ type: " + productType + ", number: " + numberOfItems + "}";
    }
}

enum ProductType {
    A, B, C
}
