package Command;



public class GarageDoorDownCommand  implements  Command{
   GarageDoor garageDoor;
    @Override
    public void execute() {
        garageDoor.up();
    }

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
}
