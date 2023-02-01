public class AndroidToDoApp implements  Observer{
    @Override
    public void update(String appData) {
        System.out.println("Android app data update :D");
        System.out.println(appData);
    }
}
