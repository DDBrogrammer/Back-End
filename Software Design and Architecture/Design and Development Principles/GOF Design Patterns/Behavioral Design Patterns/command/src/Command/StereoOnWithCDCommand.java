package Command;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setCD();
        stereo.setVolume(11.0);
        stereo.on();
    }
}
