public class HouseBlend extends  Beverage{
    private final double COST= 2.78;

    private  final String description="HouseBlend, ";
    @Override
    public double cost() {
        return COST;
    }
    public String getDescription() {
        return description;
    }
}
