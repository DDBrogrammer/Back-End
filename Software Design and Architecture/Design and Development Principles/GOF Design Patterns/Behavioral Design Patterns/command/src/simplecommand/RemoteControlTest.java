package simplecommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();
        Light light= new Light();
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        GarageDoor garageDoor=new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand=new GarageDoorOpenCommand(garageDoor);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
