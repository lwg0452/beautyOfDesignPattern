package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PdfResourceFile("pdf"));
        resourceFiles.add(new WordResourceFile("word"));
        resourceFiles.add(new PptResourceFile("ppt"));

        Extractor extractor = new Extractor();
        Compressor compressor = new Compressor();

        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
            resourceFile.accept(compressor);
        }
    }
}
