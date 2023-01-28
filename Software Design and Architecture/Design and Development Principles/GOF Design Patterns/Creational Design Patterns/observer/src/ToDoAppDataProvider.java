import java.util.ArrayList;

public class ToDoAppDataProvider implements  Subject{
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
        observer.update();
       }
    }
}
