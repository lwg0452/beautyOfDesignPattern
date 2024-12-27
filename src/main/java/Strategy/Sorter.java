package Strategy;

import com.google.common.base.Preconditions;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Sorter {

    private static final long GB = 1024 * 1024 * 1024;
    private static final List<AlgRange> algRanges = new ArrayList<>();

    static {
        algRanges.add(new AlgRange(0, 5 * GB, "QUICK_SORT"));
        algRanges.add(new AlgRange(5 * GB, 10 * GB, "EXTERNAL_SORT"));
        algRanges.add(new AlgRange(10 * GB, 100 * GB, "CONCURRENT_EXTERNAL_SORT"));
        algRanges.add(new AlgRange(100 * GB, Long.MAX_VALUE, "MAP_REDUCE_SORT"));
    }

    public void sort(String filePath) {
        Preconditions.checkNotNull(filePath);
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg alg = null;
        for (AlgRange algRange : algRanges) {
            if (algRange.inRange(fileSize)) {
                alg = SortAlgorithmFactory.getSortAlgorithm(algRange.getAlgName());
                break;
            }
        }
        if (alg == null) {
            throw new RuntimeException("No matched algorithm");
        }
        alg.sort(filePath);
    }

}
