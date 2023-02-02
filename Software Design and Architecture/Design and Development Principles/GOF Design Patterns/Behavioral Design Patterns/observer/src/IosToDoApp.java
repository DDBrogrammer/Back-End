public class IosToDoApp implements Observer{
    @Override
    public void update(String appData) {
        System.out.println("IOS app data update :D");
        System.out.println(appData);
    }
}
