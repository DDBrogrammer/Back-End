public class Mocha extends  CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    private final double COST= 3.20;
    @Override
    public double cost() {
        return beverage.cost()+ COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Mocha";
    }
}
