package character;

import behavior.SwimMovementBehavior;

public class Aquaman extends Character {
    public Aquaman() {
        System.out.println("Im Aquaman");
        movementBehavior=new SwimMovementBehavior();
    }
}
