import model.Product;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterForeachDemo {
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  

        // print only product price
        productsList.stream()  
                             .filter(product -> product.getPrice() == 30000)
                             .forEach(product -> System.out.println(product.getPrice()));

        // print only product name
        productsList.stream()
                .filter(product -> product.getPrice() == 30000)
                .forEach(product -> System.out.println(product.getName()));

        // print product price and name -- multiple statements in forEach block
        productsList.stream()
                .filter(product -> product.getPrice() == 30000)
                .forEach(product -> {
                    System.out.println(product.getPrice());
                    System.out.println(product.getName());
                });
    }  
}  