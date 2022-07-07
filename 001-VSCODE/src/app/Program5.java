package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import utils.UpperCaseName;

public class Program5 {
    
    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1000.00));
        list.add(new Product("PC", 1100.00));
        list.add(new Product("Caderno", 50.00));
        list.add(new Product("Agenda", 10.00));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        //Function
        //Primeira versão do predicado: Implementação da interface
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //Segunda versão do predicado: Reference Method com método estático
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //Terceira versão do predicado: Reference Method com método não estático
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //Quarta versão: Expressão Lambda declarada
        //List<String> names = list.stream().map(func).collect(Collectors.toList());

        //Quinta versão: Expressão Lambda inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
        
    }
}
