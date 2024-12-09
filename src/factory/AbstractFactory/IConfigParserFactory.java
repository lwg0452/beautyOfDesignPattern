package factory.AbstractFactory;

public interface IConfigParserFactory {

    IRuleConfigParser createRuleParser();
    ISystemConfigParser createSystemParser();
}
