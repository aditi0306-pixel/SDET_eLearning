package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class wrapper {
	
	static String path = "resource//testdata_elearning.xlsx";
	static String sheet = "Sheet1";
	
	public static String getDataFromExcel(int row, int column) throws IOException {
		
		FileInputStream fs = new FileInputStream(path);
		
		//workbook declaration
		Workbook wb = new XSSFWorkbook(fs);
		//sheet declaration
		Sheet sh = wb.getSheet(sheet);
		
		Row rows = sh.getRow(row);
		Cell cells = rows.getCell(column);
		
		DataFormatter df = new DataFormatter();
		String formatValue = df.formatCellValue(cells);
		System.out.println("Formated value " + formatValue);
	    return formatValue;


	}

}
