public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        WildTurkey wildTurkey=new WildTurkey();
        Duck turkeyAdapter=new TurkeyAdapter(wildTurkey);
        System.out.println("The Turkey says...");
        wildTurkey.fly();
        wildTurkey.gobble();
        System.out.println("\\nThe Duck says...");
        mallardDuck.fly();
        mallardDuck.quack();
        System.out.println("\\nThe Turkey Adapter says...");
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
