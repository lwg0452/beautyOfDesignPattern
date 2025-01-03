package Visitor;

public abstract class ResourceFile {

    private String fileName;

    public ResourceFile(String fileName) {
        this.fileName = fileName;
    }

    public abstract void accept(Visitor visitor);
}
