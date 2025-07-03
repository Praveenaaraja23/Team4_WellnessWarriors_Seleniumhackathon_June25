package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {
		
	 public static List<Map<String, String>> readSheet(String sheetName) throws IOException {
	        String path = System.getProperty("user.dir") + "/src/test/resources/testdata.xlsx";
	        FileInputStream fis = new FileInputStream(new File(path));
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet(sheetName);

	        if (sheet == null) {
	            workbook.close();
	            throw new IllegalArgumentException("Sheet " + sheetName + " not found.");
	        }

	        DataFormatter df = new DataFormatter();
	        List<Map<String, String>> sheetData = new ArrayList<>();
	        Row headerRow = sheet.getRow(0);
	        int colCount = headerRow.getLastCellNum();
	        int rowCount = sheet.getPhysicalNumberOfRows();

	        for (int i = 1; i < rowCount; i++) {
	            Row row = sheet.getRow(i);
	            if (row == null) continue;

	            Map<String, String> rowData = new LinkedHashMap<>();
	            for (int j = 0; j < colCount; j++) {
	                String key = df.formatCellValue(headerRow.getCell(j)).trim();
	                String value = df.formatCellValue(row.getCell(j)).trim();
	                rowData.put(key, value);
	            }
	            sheetData.add(rowData);
	        }

	        workbook.close();
	        fis.close();
	        return sheetData;
	    }

	    public static Object[][] getFilteredData(String sheetName, String expectedType) throws IOException {
	        List<Map<String, String>> rawData = readSheet(sheetName);
	        List<Map<String, String>> filtered = new ArrayList<>();

	        for (Map<String, String> row : rawData) {
	            String type = row.get("expected message");
	            if (type != null && type.toLowerCase().contains(expectedType.toLowerCase())) {
	                filtered.add(row);
	            }
	        }

	        Object[][] result = new Object[filtered.size()][1];
	        for (int i = 0; i < filtered.size(); i++) {
	            result[i][0] = filtered.get(i);
	        }

	        return result;
	    }

	    public static List<String> getEmailsByType(String sheetName, String typeKeyword) throws IOException {
	        List<Map<String, String>> rows = readSheet(sheetName);
	        List<String> emails = new ArrayList<>();
	        for (Map<String, String> row : rows) {
	            String type = row.get("expected message");
	            String email = row.get("Email");
	            if (type != null && email != null && type.toLowerCase().contains(typeKeyword.toLowerCase())) {
	                emails.add(email);
	            }
	        }
	        return emails;
	    }

	    public static List<String> getPasswordsByType(String sheetName, String typeKeyword) throws IOException {
	        List<Map<String, String>> rows = readSheet(sheetName);
	        List<String> passwords = new ArrayList<>();
	        for (Map<String, String> row : rows) {
	            String type = row.get("expected message");
	            String password = row.get("password");
	            if (type != null && password != null && type.toLowerCase().contains(typeKeyword.toLowerCase())) {
	                passwords.add(password);
	            }
	        }
	        return passwords;
	    }

	    public static List<String> getPlaceholders(String sheetName) throws IOException {
	        List<Map<String, String>> rows = readSheet(sheetName);
	        List<String> placeholders = new ArrayList<>();
	        for (Map<String, String> row : rows) {
	            String ph = row.get("placeholder");
	            if (ph != null && !ph.isEmpty()) {
	                placeholders.add(ph);
	            }
	        }
	        return placeholders;
	    }

	    // Data Providers
	    @org.testng.annotations.DataProvider(name = "validLoginData")
	    public static Object[][] validLoginData() throws IOException {
	        return getFilteredData("Login", "valid");
	    }

	    @org.testng.annotations.DataProvider(name = "invalidLoginData")
	    public static Object[][] invalidLoginData() throws IOException {
	        return getFilteredData("Login", "invalid");
	    }
	}


