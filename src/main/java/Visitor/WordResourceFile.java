package Visitor;

public class WordResourceFile extends ResourceFile {

    public WordResourceFile(String fileName) {
        super(fileName);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
