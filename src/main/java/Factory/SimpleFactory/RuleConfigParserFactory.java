package Factory.SimpleFactory;

public class RuleConfigParserFactory {

    public static IRuleConfigParser createParser(String extensionName) {
        if (extensionName == null || extensionName.isEmpty()) {
            return null;
        }
        IRuleConfigParser parser = null;
        if (extensionName.equalsIgnoreCase("json")) {
            parser = new JsonRuleConfigParser();
        } else if (extensionName.equalsIgnoreCase("xml")) {
            parser = new XmlRuleConfigParser();
        } else if (extensionName.equalsIgnoreCase("yaml")) {
            parser = new YamlRuleConfigParser();
        } else if (extensionName.equalsIgnoreCase("properties")) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}
