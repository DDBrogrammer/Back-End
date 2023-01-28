import character.Aquaman;
import character.Batman;
import character.Character;
import character.SuperBoy;

public class Main {
    public static void main(String[] args) {
           Character batman=new Batman();
           batman.move();
           Character supperBoy=new SuperBoy();
           supperBoy.move();
           Character aquaman=new Aquaman();
           aquaman.move();
    }
}
