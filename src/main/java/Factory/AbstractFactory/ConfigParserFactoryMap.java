package Factory.AbstractFactory;

import java.util.HashMap;
import java.util.Map;

public class ConfigParserFactoryMap {

    private static final Map<String, IConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonConfigParserFactory());
        cachedFactories.put("xml", new XmlConfigParserFactory());
        cachedFactories.put("yaml", new YamlConfigParserFactory());
        cachedFactories.put("properties", new PropertiesConfigParserFactory());
    }

    public static IConfigParserFactory getCachedFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return cachedFactories.get(type.toLowerCase());
    }
}
