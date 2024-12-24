package Factory.AbstractFactory;

public interface IConfigParserFactory {

    IRuleConfigParser createRuleParser();
    ISystemConfigParser createSystemParser();
}
