package Visitor;

public interface Visitor {

    void visit(PdfResourceFile file);

    void visit(WordResourceFile file);

    void visit(PptResourceFile file);
}
