package B2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void info() {
        System.out.println(this.name + " is " + this.color);
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("apple","red");
        Fruit cherry = new Fruit("cherry","red");
        Fruit mango = new Fruit("mango","yellow");
        Fruit lemon = new Fruit("lemon","green");
        ArrayList<Fruit> cart = new ArrayList<>();
        cart.add(apple);
        cart.add(cherry);
        cart.add(mango);
        cart.add(lemon);
        cart.stream().forEach(Fruit::info);
        cart.stream()
                .sorted(Comparator.comparing(Fruit::getName))
                .collect((Collectors.toList()));
        List<Fruit> redFruits = cart
                .stream()
                .filter(fruit -> fruit.getColor()
                        .equals("red"))
                .collect(Collectors.toList());



    }


}
