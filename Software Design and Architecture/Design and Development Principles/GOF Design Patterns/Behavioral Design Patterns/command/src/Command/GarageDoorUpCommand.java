package Command;



public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    @Override
    public void execute() {
        garageDoor.up();
    }

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
}
