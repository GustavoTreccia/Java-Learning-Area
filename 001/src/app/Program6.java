package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.ProductService;

public class Program6 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1000.00));
        list.add(new Product("PC", 1100.00));
        list.add(new Product("Caderno", 50.00));
        list.add(new Product("Agenda", 10.00));
        
        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'P');
        //double sum = ps.filteredSum(list, p -> p.getPrice() > 100.0);

        System.out.println("Sum = " + String.format("%.2f", sum));

    }
    
}
