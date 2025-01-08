package Memento;

import java.util.Deque;
import java.util.LinkedList;

public class SnapshotHolder {

    private Deque<Snapshot> snapshots;

    public SnapshotHolder() {
        this.snapshots = new LinkedList<>();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.offerLast(snapshot);
    }

    public Snapshot popSnapshot() {
        return snapshots.pollLast();
    }

}
