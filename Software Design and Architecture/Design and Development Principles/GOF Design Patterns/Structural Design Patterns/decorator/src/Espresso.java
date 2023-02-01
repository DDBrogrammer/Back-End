public class Espresso extends Beverage{
    private final double COST= 1.99;

    private  final String description="Espresso";
    @Override
    public double cost() {
        return COST;
    }


    public String getDescription() {
        return description;
    }
}
