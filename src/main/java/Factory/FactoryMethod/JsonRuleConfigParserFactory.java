package Factory.FactoryMethod;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
