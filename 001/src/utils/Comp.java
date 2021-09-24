package utils;

import java.util.Comparator;

import entities.Product;

public class Comp implements Comparator<Product>{

    Comparator<Product> comp = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        }   
    };

    @Override
    public int compare(Product o1, Product o2) {
        // TODO Auto-generated method stub
        return 0;
    }
}
