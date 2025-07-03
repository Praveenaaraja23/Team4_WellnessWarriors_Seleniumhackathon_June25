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
	
/*	public List<Map<String, String>> getData(String excelFilePath, String sheetName)
			throws InvalidFormatException, IOException {
		Sheet sheet = getSheetByName(excelFilePath, sheetName);
		return readSheet(sheet);
	}

	public List<Map<String, String>> getData(String excelFilePath, int sheetNumber)
			throws InvalidFormatException, IOException {
		Sheet sheet = getSheetByIndex(excelFilePath, sheetNumber);
		return readSheet(sheet);
	}
    
	private Sheet getSheetByName(String excelFilePath, String sheetName) throws IOException, InvalidFormatException {
		Sheet sheet = getWorkBook(excelFilePath).getSheet(sheetName);
		return sheet;
	}

	private Sheet getSheetByIndex(String excelFilePath, int sheetNumber) throws IOException, InvalidFormatException {
		Sheet sheet = getWorkBook(excelFilePath).getSheetAt(sheetNumber);
		return sheet;
	}

	private Workbook getWorkBook(String excelFilePath) throws IOException, InvalidFormatException {
		return WorkbookFactory.create(new File(excelFilePath));
	}

	private List<Map<String, String>> readSheet(Sheet sheet) {
		Row row;
		int totalRow = sheet.getPhysicalNumberOfRows();
		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();
		int headerRowNumber = getHeaderRowNumber(sheet);
		if (headerRowNumber != -1) {
			int totalColumn = sheet.getRow(headerRowNumber).getLastCellNum();
			int setCurrentRow = 1;
			for (int currentRow = setCurrentRow; currentRow <= totalRow; currentRow++) {
				row = getRow(sheet, sheet.getFirstRowNum() + currentRow);
				LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();
				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
					columnMapdata.putAll(getCellValue(sheet, row, currentColumn));
				}
				excelRows.add(columnMapdata);
			}
		}
		return excelRows;
	}

	private int getHeaderRowNumber(Sheet sheet) {
		Row row;
		int totalRow = sheet.getLastRowNum();
		for (int currentRow = 0; currentRow <= totalRow + 1; currentRow++) {
			row = getRow(sheet, currentRow);
			if (row != null) {
				int totalColumn = row.getLastCellNum();
				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
					Cell cell;
					cell = row.getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
					if (cell.getCellType() == CellType.STRING) {
						return row.getRowNum();

					} else if (cell.getCellType() == CellType.NUMERIC) {
						return row.getRowNum();

					} else if (cell.getCellType() == CellType.BOOLEAN) {
						return row.getRowNum();
					} else if (cell.getCellType() == CellType.ERROR) {
						return row.getRowNum();
					}
				}
			}
		}
		return (-1);
	}

	private Row getRow(Sheet sheet, int rowNumber) {
		return sheet.getRow(rowNumber);
	}

	private LinkedHashMap<String, String> getCellValue(Sheet sheet, Row row, int currentColumn) {
		LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();
		Cell cell;
		if (row == null) {
			if (sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
					.getCellType() != CellType.BLANK) {
				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();
				columnMapdata.put(columnHeaderName, "");
			}
		} else {
			cell = row.getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			if (cell.getCellType() == CellType.STRING) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, cell.getStringCellValue());
				}
			} else if (cell.getCellType() == CellType.NUMERIC) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, NumberToTextConverter.toText(cell.getNumericCellValue()));
				}
			} else if (cell.getCellType() == CellType.BLANK) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, "");
				}
			} else if (cell.getCellType() == CellType.BOOLEAN) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, Boolean.toString(cell.getBooleanCellValue()));
				}
			} else if (cell.getCellType() == CellType.ERROR) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, Byte.toString(cell.getErrorCellValue()));
				}
			}
		}
		return columnMapdata;
	} 
} */
	
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


