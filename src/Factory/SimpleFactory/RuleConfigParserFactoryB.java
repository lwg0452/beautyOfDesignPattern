package Factory.SimpleFactory;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactoryB {

    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String extensionName) {

        if (extensionName == null || extensionName.isEmpty()) {
            return null;
        }
        IRuleConfigParser parser = cachedParsers.get(extensionName.toLowerCase());
        return parser;
    }
}
