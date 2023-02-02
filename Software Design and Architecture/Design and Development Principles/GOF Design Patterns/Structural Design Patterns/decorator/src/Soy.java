public class Soy extends  CondimentDecorator{
    Beverage beverage;
    private final double COST= 7.20;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+ COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Soy";
    }
}
