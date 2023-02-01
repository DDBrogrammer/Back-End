public class Decaf extends  Beverage{
    private final double COST= 4.99;

    private  final String description="Decaf, ";
    @Override
    public double cost() {
        return COST;
    }


    public String getDescription() {
        return description;
    }
}
