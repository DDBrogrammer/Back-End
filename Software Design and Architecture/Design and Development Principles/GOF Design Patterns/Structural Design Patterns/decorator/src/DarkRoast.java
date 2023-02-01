public class DarkRoast extends Beverage{
    private final double COST= 3.5;
    private  final String description="DarkRoast ";
    @Override
    public double cost() {
        return COST;
    }
    public String getDescription() {
        return description;
    }
}
