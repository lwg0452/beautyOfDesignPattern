package Visitor;

public class PdfResourceFile extends ResourceFile {

    public PdfResourceFile(String fileName) {
        super(fileName);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
