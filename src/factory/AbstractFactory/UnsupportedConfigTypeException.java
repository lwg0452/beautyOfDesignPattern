package factory.AbstractFactory;

public class UnsupportedConfigTypeException extends Throwable {
    public UnsupportedConfigTypeException(String e) {
        System.out.println(e);
    }
}
