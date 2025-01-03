package Visitor;

public class Extractor implements Visitor{


    public void extract2txt(PdfResourceFile file) {
        // ...
        // extract text to txt file...
        System.out.println("PDF file has been extracted.");
    }

    public void extract2txt(WordResourceFile file) {
        // ...
        // extract text to txt file...
        System.out.println("Word file has been extracted.");
    }

    public void extract2txt(PptResourceFile file) {
        // ...
        // extract text to txt file...
        System.out.println("Ppt file has been extracted.");
    }


    @Override
    public void visit(PdfResourceFile file) {
        extract2txt(file);
    }

    @Override
    public void visit(WordResourceFile file) {
        extract2txt(file);
    }

    @Override
    public void visit(PptResourceFile file) {
        extract2txt(file);
    }
}
