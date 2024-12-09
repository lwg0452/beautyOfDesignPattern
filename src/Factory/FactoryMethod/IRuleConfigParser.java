package Factory.FactoryMethod;

import Factory.SimpleFactory.RuleConfig;

public interface IRuleConfigParser {
    RuleConfig parse(String fileName);
}
