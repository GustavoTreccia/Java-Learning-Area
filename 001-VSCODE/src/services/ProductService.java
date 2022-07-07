package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
    
    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for(Product p : list){
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}

/* 
Sempre procure manter a neutralidade de um serviço ou utility, visto que, para casos de manutenção
a presença de uma classe neutra (ou seja, aquela que não tem parâmetros pré denifidos) se torna melhor
além de mais limpa sua leitura e manutenção.

No caso do ProductService aqui, se você deixar pré definido uma letra ou relativos, se caso houver uma
mudança, você será obrigado a mudar diretamente na classe, o que pode gerar uma série de problemas.

*/
