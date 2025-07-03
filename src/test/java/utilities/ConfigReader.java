package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties properties;
    private final static String propertyFilePath = "src/test/resources/config/config.properties";

    public ConfigReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    public static String getApplicationUrl() {
        String url = properties.getProperty("url");
        System.out.println(url);
        if (url != null)
            return url;
        else
            throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public static String excelPath() {
        String path = properties.getProperty("path");
        System.out.println(path);
        if (path != null)
            return path;
        else
            throw new RuntimeException("path not specified in the Configuration.properties file.");
    } 
    public static String getFullName() {
        String fullname = properties.getProperty("fullname");
        if (fullname != null)
            return fullname;
        else
            throw new RuntimeException("fullname not specified in the Configuration.properties file.");
    }

    public static String getUsername() {
        String username = properties.getProperty("username");
        if (username != null)
            return username;
        else
            throw new RuntimeException("username not specified in the Configuration.properties file.");
    }

    public static String getPassword() {
        String password = properties.getProperty("password");
        if (password != null)
            return password;
        else
            throw new RuntimeException("password not specified in the Configuration.properties file.");
    }
    public static String getinvalidData() {
        String password = properties.getProperty("invalidData");
        if (password != null)
            return password;
        else
            throw new RuntimeException("password not specified in the Configuration.properties file.");
    }
 /*   public static String getinvalidemail() {
        String password = properties.getProperty("invalid");
        if (password != null)
            return password;
        else
            throw new RuntimeException("invalid not specified in the Configuration.properties file.");
    } */

    
    
    
    
    
    
    
    
    
    
/*	static ThreadLocal<String> threadlocalbrowsertype = new ThreadLocal<>();
	private static Properties properties;
	private final static String propertyFilePath = "src/test/resources/dsAlgo_Configurations/config.properties";

	// To get the path of config properties file
	public static void loadConfig() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + propertyFilePath);
		}

	}

	// Get the url details from config properties file

	public static String getConfig(String key) {
		String value = properties.getProperty(key);
		if (value != null)
			return value;
		else
			throw new RuntimeException("Key '" + key + "' not found in config.properties file.");
	}

	public static void setBrowserType(String browser) {
		threadlocalbrowsertype.set(browser);
	}

	public static String getBrowserType() throws Throwable {

		if (threadlocalbrowsertype.get() != null) {
			return threadlocalbrowsertype.get();
		} else {

			throw new RuntimeException("browser is not specified in the testng.xml");
		}
	} */
}



