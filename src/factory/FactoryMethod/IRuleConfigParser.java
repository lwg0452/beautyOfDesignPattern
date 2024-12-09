package factory.FactoryMethod;

import factory.SimpleFactory.RuleConfig;

public interface IRuleConfigParser {
    RuleConfig parse(String fileName);
}
