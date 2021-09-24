package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import entities.Product;

public class Program3{

    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1000.00));
        list.add(new Product("PC", 1100.00));
        list.add(new Product("Caderno", 50.00));
        list.add(new Product("Agenda", 10.00));

        //MODO ARROW FUNCTION
        Comparator<Product> comp = (p1, p2) -> { 
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        //Pode ser utilizado também:
        //Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comp);

        for (Product p : list){
            System.out.println(p);
        }

        System.out.println();
        System.out.println();

        //RemoveIf
        list.removeIf(Product :: nonstaticProductPredicate); 

        for (Product p : list){
            System.out.println(p);
        }

    }
}