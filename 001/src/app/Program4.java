package app;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

import entities.Product;
import utils.PriceUpdate;

public class Program4 {
    
    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1000.00));
        list.add(new Product("PC", 1100.00));
        list.add(new Product("Caderno", 50.00));
        list.add(new Product("Agenda", 10.00));

        double factor = 1.1;

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };

        //Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor)


        //Consumer
        //Primeira versão: Implementação da interface
        //list.forEach(new PriceUpdate());

        //Segunda versão: Reference Method com método estático
        //list.forEach(Product::staticPriceUpdate);

        //Terceira versão: Reference Method com método não estático
        //list.forEach(Product::nonStaticPriceUpdate);

        //Quarta versão: Expressão Lambda declarada
        //list.forEach(cons);

        //Quinta versão: Expressão Lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * factor));
        

        list.forEach(System.out::println);

    }
}
