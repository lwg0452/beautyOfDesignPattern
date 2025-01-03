package Visitor;

public class PptResourceFile extends ResourceFile {

    public PptResourceFile(String fileName) {
        super(fileName);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
