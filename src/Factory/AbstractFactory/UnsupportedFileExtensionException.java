package Factory.AbstractFactory;

public class UnsupportedFileExtensionException extends Throwable {
    public UnsupportedFileExtensionException(String e) {
        System.out.println(e);
    }
}
