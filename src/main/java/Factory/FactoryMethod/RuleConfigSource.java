package Factory.FactoryMethod;

import Factory.SimpleFactory.RuleConfig;

public class RuleConfigSource {

    public RuleConfig load(String fileName) throws UnsupportedExtensionException {
        if (fileName == null || fileName.isEmpty()) return null;
        String extension = getFileExtension(fileName);

        IRuleConfigParserFactory factory = RuleConfigParserFactoryMap.getParserFactory(extension);
        if (factory == null) {
            throw new UnsupportedExtensionException(
                    "Unsupported config file extension: " + extension
            );
        }

        IRuleConfigParser parser = factory.createParser();
        RuleConfig config = parser.parse(fileName);
        return config;

    }

    private static String getFileExtension(String fileName) {
        return "json";
    }
}
