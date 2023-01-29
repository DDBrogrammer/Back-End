import java.util.ArrayList;

public class ToDoAppDataProvider implements  Subject{
    private String appData;
    private ArrayList<Observer> observers;
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
     observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
    for (Observer observer:observers){
        observer.update( appData);
       }
    }

    public ToDoAppDataProvider() {
        observers=new ArrayList<>();
    }

    public void setAppData(String appData) {
        this.appData = appData;
        notifyObserver();
    }
    public String getAppData(){
        return appData;
    };
}
