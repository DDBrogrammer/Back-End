public class Main {
    public static void main(String[] args) {
        Beverage beverage= new Espresso();
        beverage=new Milk(beverage);
        beverage=new Mocha(beverage);
        beverage=new Soy(beverage);
        beverage=new Whip(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        System.out.println("This is your drink :D");


    }
}
