package Prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrototypeDemo {

    private Map<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        // get data from database.
        List<SearchWord> toBeUpdateKeywords = getSearchWords(lastUpdateTime);

        // Prototype Pattern
        Map<String, SearchWord> newKeywords = new HashMap<>(currentKeywords);

        long maxNewUpdateTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdateKeywords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdateTime) {
                maxNewUpdateTime = searchWord.getLastUpdateTime();
            }

            if (newKeywords.containsKey(searchWord.getKeyword())) {
                newKeywords.replace(searchWord.getKeyword(), searchWord);
            } else {
                newKeywords.put(searchWord.getKeyword(), searchWord);
            }
        }
        lastUpdateTime = maxNewUpdateTime;
        currentKeywords = newKeywords;
    }

    // get data from database
    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        return null;
    }
}
