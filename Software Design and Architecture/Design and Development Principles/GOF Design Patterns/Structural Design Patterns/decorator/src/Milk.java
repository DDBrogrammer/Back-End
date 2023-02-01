public class Milk extends  CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage;
    private final double COST= 1.99;
    @Override
    public double cost() {
        return beverage.cost()+ COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Milk";
    }
}
