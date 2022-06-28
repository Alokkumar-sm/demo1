package selenium_demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read {
	
	public static void main(String[] args) throws IOException {
		
		String Excelpath = "C:\\Users\\Alok\\Desktop\\Excelread_selenium.xlsx";
		
		FileInputStream file = new FileInputStream(Excelpath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheetAt = workbook.getSheetAt(0);
		
		//using for loop
		
		int lastRowNum = sheetAt.getLastRowNum();
		short lastCellNum = sheetAt.getRow(1).getLastCellNum();
		
		
		for(int r=0; r<lastRowNum; r++) {
			XSSFRow row = sheetAt.getRow(r);
			
			for(int c=0; c<lastCellNum; c++) {
				
				XSSFCell cell = row.getCell(c);
				
				switch(cell.getCellType()) {
				case STRING: System.out.println(cell.getStringCellValue()); break;
		
				}
			}
	
		}

		System.out.println();
		
	}

}
