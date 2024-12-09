package Factory.SimpleFactory;

public class RuleConfigSource {
    public RuleConfig load(String fileName) throws UnsupportedExtensionException {
        if (fileName == null || fileName.isEmpty()) {
            return null;
        }
        String extension = getFileExtension(fileName);

        // create object through factory pattern.
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(extension);

        if (parser == null) {
            throw new UnsupportedExtensionException(
                    "Unsupported config file extension: " + extension);
        }

        RuleConfig config = parser.parse(fileName);
        return config;
    }

    private static String getFileExtension(String fileName) {
        // return file extension, eg: config.json return json.
        return "json";
    }

}
