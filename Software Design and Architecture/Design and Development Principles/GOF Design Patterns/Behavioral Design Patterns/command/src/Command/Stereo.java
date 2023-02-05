package Command;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    String type;

    double volume;
    public void on(){
        System.out.println("stereo on");
    }
    public void off(){
        System.out.println("stereo off");
    }

    public void setCD(){
        System.out.println("set type CD");
        type="CD";
    }

    public void  setVolume(double volume){
        this.volume= volume;
    }
}
