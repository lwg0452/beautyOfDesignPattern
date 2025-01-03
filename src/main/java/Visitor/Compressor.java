package Visitor;

public class Compressor implements Visitor{
    @Override
    public void visit(PdfResourceFile file) {
        //...
        System.out.println("Pdf has bean compressed.");
    }

    @Override
    public void visit(WordResourceFile file) {
        //...
        System.out.println("Word has bean compressed.");
    }

    @Override
    public void visit(PptResourceFile file) {
        //...
        System.out.println("Ppt has bean compressed.");
    }
}
