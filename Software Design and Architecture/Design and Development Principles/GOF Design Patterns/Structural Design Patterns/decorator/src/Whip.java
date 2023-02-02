public class Whip extends  CondimentDecorator{
    Beverage beverage;
    private final double COST= 8.20;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+ COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Whip";
    }
}
