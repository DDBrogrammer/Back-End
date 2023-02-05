package Command;

public class Light {
    String location;
  public void on(){
      System.out.println("Light on");
  }

  public void  off(){
      System.out.println("Light off");
  }

    public Light(String location) {
        this.location = location;
    }
}
