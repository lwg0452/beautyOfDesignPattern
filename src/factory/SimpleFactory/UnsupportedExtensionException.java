package factory.SimpleFactory;

public class UnsupportedExtensionException extends Throwable {
    public UnsupportedExtensionException(String msg) {
        System.out.println(msg);
    }
}
