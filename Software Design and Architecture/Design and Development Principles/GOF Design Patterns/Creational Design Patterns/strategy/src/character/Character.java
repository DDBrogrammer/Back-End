package character;

import behavior.MovementBehavior;

public class Character {
    MovementBehavior movementBehavior;

    public void move(){
        this.movementBehavior.move();
    }
}
