package character;

import behavior.RunMovementBehavior;

public class Batman extends Character {
    public Batman() {
        System.out.println("Im Batman: ");
        movementBehavior=new RunMovementBehavior();
    }

}
