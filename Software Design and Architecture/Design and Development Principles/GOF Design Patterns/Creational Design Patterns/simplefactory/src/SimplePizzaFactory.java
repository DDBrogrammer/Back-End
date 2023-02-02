public class SimplePizzaFactory  {
    Pizza pizza;
    public  Pizza createPizza(String type){
         pizza=null;
        if (type == "cheese") {
            pizza=new CheesePizza();
        }else if(type== "peperoni"){
            pizza=new PepperoniPizza();
        }
        else if(type== "veggie"){
            pizza=new VeggiePizza();
        }
        return pizza;
    }
}
