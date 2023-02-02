public class WindowToDoApp implements Observer{

    @Override
    public void update(String appData) {
        System.out.println("Window app data update :D");
        System.out.println(appData);
    }
}
