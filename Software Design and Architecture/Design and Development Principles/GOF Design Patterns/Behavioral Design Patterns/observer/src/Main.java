public class Main {
    public static void main(String[] args) {
        ToDoAppDataProvider appDataProvider=new ToDoAppDataProvider();
        Observer observerAndroid =new AndroidToDoApp();
        Observer observerWindow=new WindowToDoApp();
        Observer observerIos=new IosToDoApp();
        appDataProvider.registerObserver(observerAndroid);
        appDataProvider.registerObserver(observerWindow);
        appDataProvider.registerObserver(observerIos);
        appDataProvider.setAppData(" new DATA 1");
        appDataProvider.setAppData(" new DATA 2");
        appDataProvider.setAppData(" new DATA 3");
    }
}
