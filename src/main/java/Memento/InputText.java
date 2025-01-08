package Memento;

public class InputText {

    private StringBuilder input;

    public InputText() {
        input = new StringBuilder();
    }

    public String getText() {
        return input.toString();
    }

    public void append(String text) {
        input.append(text);
    }

    public void restoreSnapshot(Snapshot snapshot) {
        if (snapshot == null) {
            return;
        }
        String text = snapshot.getText();
        input.replace(0, input.length(), text);
    }
}
