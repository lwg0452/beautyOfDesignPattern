package Observer.classic_pattern;

public class Demo {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserverOne());
        subject.addObserver(new ConcreteObserverTwo());

        subject.notifyObservers(new Message("Hello World"));
    }
}
