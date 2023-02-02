import java.util.ArrayList;

public class Pizza {

    String name;
    String dough;

    String sauce;

    ArrayList toppings=new ArrayList();
    public void prepare(){
        System.out.println("Prepare "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for(int i=0;i<toppings.size();i++){
            System.out.println("   "+ toppings.get(i));
        }
    };
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    };
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    };

    public  String getName(){
        return  name;
    }

}
