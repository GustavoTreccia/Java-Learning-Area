package app;

import java.util.List;
//import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;

//import utils.ProductPredicate;
import entities.Product;

public class Program2{

    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1000.00));
        list.add(new Product("PC", 1100.00));
        list.add(new Product("Caderno", 50.00));
        list.add(new Product("Agenda", 10.00));

        //MODO VARIAVEL ANONIMA
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2){
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        list.sort(comp);

        for (Product p : list){
            System.out.println(p);
        }

        System.out.println();
        System.out.println();

        //Predicate
        //Primeira versão do predicado: Implementação da interface
        //Segunda versão do predicado: Reference Method com método estático
        //Terceira versão do predicado: Reference Method com método não estático
        //Quarta versão: Expressão Lambda declarada
        //Quinta versão: Expressão Lambda inline

        double min = 100.00;
        
        list.removeIf(p -> p.getPrice() <= min); 

        for (Product p : list){
            System.out.println(p);
        }

    }
}