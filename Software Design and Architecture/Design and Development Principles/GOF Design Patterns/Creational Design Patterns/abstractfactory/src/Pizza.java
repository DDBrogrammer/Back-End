import ingredient.*;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    };
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    };


    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }
}
