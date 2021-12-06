package helperPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public PropertyReader(String path) throws FileNotFoundException {
		FileInputStream config = new FileInputStream(path);
	}
	
	public static Properties getProperties(FileInputStream f) throws IOException {
		Properties pReader = new Properties();
		pReader.load(f);
		return pReader;
	}
}
