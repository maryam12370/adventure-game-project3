package se.iths.maryam.adventuregame;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class AppInfo {

    private static AppInfo Instance;
    private final Properties properties = new Properties();

    private AppInfo() {
        loadProperties();
    }

    public static AppInfo getInstance() {
        if (Instance == null) {
            Instance = new AppInfo();
        }
        return Instance;
    }

    private void loadProperties() {
        Path path = Paths.get("config.properties");
        try {
            properties.load(Files.newInputStream(path));
        } catch (IOException e) {
            System.err.println("Error loading app.properties: " + e.getMessage());
        }
    }

    public String getVersion() {
        return properties.getProperty("app.version");
    }

    public String getAuthor() {
        return properties.getProperty("app.version");
    }
}