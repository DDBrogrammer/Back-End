package Command;

import simplecommand.Command;
import simplecommand.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    @Override
    public void execute() {
        garageDoor.up();
    }

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
}
