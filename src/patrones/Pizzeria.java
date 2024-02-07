package patrones;

public class Pizzeria {
    public Pizza smallPizza(){
        return new Pizza(6);
    }
    public Pizza mediumPizza(){
        return new Pizza(8);
    }
    public Pizza BigPizza(){
        return new Pizza(12);
    }
}
