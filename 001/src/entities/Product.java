package entities;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    //Predicate
    //Metodo estático: Contém argumento
    
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() <= 100;
    }

    //Metodo não estático: Sem argumento
    public boolean nonstaticProductPredicate(){
        return price <= 100;
    }

    //Consumer
    //Metodo estático
    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.10);
    }

    //Metodo não estático
    public void nonStaticPriceUpdate(){
        setPrice(getPrice() * 1.1);
    }

    //Function
    //Metodo estático
    public static String staticUpperCaseName(Product p){
        return p.getName().toUpperCase();
    }

    //Metodo não estático
    public String nonStaticUpperCaseName(){
        return getName().toUpperCase();
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

    
}
