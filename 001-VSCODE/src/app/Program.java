package app;

import java.util.ArrayList;
import java.util.List;

import utils.Comp;
import entities.Product;


public class Program{

    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1000.00));
        list.add(new Product("PC", 1100.00));
        list.add(new Product("Caderno", 50.00));
        list.add(new Product("Agenda", 10.00));

        //MODO FUNÇÃO FORA DO CÓDIGO MAIN
        list.sort(new Comp());

        for (Product p : list){
            System.out.println(p);
        }

    }
}