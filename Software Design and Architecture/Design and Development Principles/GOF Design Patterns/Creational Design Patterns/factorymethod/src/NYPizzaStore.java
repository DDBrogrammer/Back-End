public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYPepperoniPizza();
        } else {
            return null;
        }
    }
}
