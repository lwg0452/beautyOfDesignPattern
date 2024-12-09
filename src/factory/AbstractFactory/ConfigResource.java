package factory.AbstractFactory;

public class ConfigResource {

    public static IConfig load(String fileName, String type) throws UnsupportedFileExtensionException, UnsupportedConfigTypeException {
        if (fileName == null || fileName.isEmpty()) {
            return null;
        }
        String extension = getFileExtension(fileName);
        IConfigParserFactory factory = ConfigParserFactoryMap.getCachedFactory(extension);

        if (factory == null) {
            throw new UnsupportedFileExtensionException("Unsupported config file extension:" + extension);
        }

        IConfigParser parser = null;
        if (type.equalsIgnoreCase("rule")) {
            parser = factory.createRuleParser();
        } else if (type.equalsIgnoreCase("system")) {
            parser = factory.createSystemParser();
        }
        if (parser == null) {
            throw new UnsupportedConfigTypeException("Unsupported config type: " + type);
        }

        IConfig config = parser.parse();
        return config;
    }

    private static String getFileExtension(String fileName) {
        return "json";
    }
}
