package Strategy;

import java.util.HashMap;
import java.util.Map;

public class SortAlgorithmFactory {

    private static final Map<String, ISortAlg> algs = new HashMap<>();

    static {
        algs.put("QUICK_SORT", new QuickSort());
        algs.put("EXTERNAL_SORT", new ExternalSort());
        algs.put("CONCURRENT_EXTERNAL_SORT", new ConcurrentExternalSort());
        algs.put("MAP_REDUCE_SORT", new MapReduceSort());
    }

    public static ISortAlg getSortAlgorithm(String algName) {
        return algs.get(algName);
    }

}
