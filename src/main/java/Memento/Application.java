package Memento;

public class Application {

    private InputText inputText;
    private SnapshotHolder snapshotHolder;

    public Application() {
        this.inputText = new InputText();
        this.snapshotHolder = new SnapshotHolder();
    }

    public InputText getInputText() {
        return inputText;
    }

    public SnapshotHolder getSnapshotHolder() {
        return snapshotHolder;
    }

    public void addText(String text) {
        Snapshot snapshot = new Snapshot(inputText.getText());
        snapshotHolder.pushSnapshot(snapshot);
        inputText.append(text);
    }

    public void print() {
        System.out.println(inputText.getText());
    }

    public void deleteLatest() {
        Snapshot snapshot = snapshotHolder.popSnapshot();
        inputText.restoreSnapshot(snapshot);
    }
}
