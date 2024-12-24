package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemNode {

    List<FileSystemNode> subNodes = new ArrayList<>();

    public Directory(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int numOfFiles = 0;
        for (FileSystemNode node : subNodes) {
            numOfFiles += node.countNumOfFiles();
        }
        return numOfFiles;
    }

    @Override
    public long countSizeOfFiles() {
        long sizeOfFiles = 0L;
        for (FileSystemNode node : subNodes) {
            sizeOfFiles += node.countSizeOfFiles();
        }
        return sizeOfFiles;
    }

    public void addSubNode(FileSystemNode node) {
        this.subNodes.add(node);
    }

    public void removeSubNode(FileSystemNode node) {
        for (int i = 0; i < subNodes.size(); i++) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(node.getPath())) {
                subNodes.remove(i);
                break;
            }
        }
    }
}
