package Observer.ClassicPattern;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
