package Command;

public class CeilingFan {
      String location;
    public void on(){
        System.out.println("Ceiling Fan on");
    }

    public void  off(){
        System.out.println("Ceiling Fan off");
    }

    public CeilingFan(String location) {
        this.location = location;
    }
}
