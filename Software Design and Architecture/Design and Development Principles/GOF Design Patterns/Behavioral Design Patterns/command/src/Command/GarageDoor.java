package Command;

public class GarageDoor {
    String location;
    public void up(){
        System.out.println("Garage is open");
    }

    public void  down(){
        System.out.println("Garage is close");
    }

    public GarageDoor(String location) {
        this.location = location;
    }
}
