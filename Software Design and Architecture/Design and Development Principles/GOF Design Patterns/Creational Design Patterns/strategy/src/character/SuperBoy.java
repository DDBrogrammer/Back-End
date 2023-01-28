package character;

import behavior.JumpMovementBehavior;

public class SuperBoy extends Character {
    public SuperBoy() {
        System.out.println("Im super boy");
        movementBehavior=new JumpMovementBehavior();
    }
}
