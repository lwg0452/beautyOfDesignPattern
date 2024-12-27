package Strategy;

public class AlgRange {

    private long min;
    private long max;
    private String algName;

    public AlgRange(long min, long max, String algName) {
        this.min = min;
        this.max = max;
        this.algName = algName;
    }

    public long getMin() {
        return min;
    }

    public long getMax() {
        return max;
    }

    public String getAlgName() {
        return algName;
    }

    public boolean inRange(long size) {
        if (size >= min && size < max) {
            return true;
        }
        return false;
    }
}
