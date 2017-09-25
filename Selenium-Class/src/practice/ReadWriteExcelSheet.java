package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		//Reading Data from Excel
		String excelPath = "C:\\Users\\ab42864\\Desktop\\Book1.xlsx";
		String dataSheetName = "Sheet1";
		/*FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(dataSheetName);
		Row row = sheet.getRow(5);//Fetching data from 1st Row
		System.out.println(sheet.getLastRowNum());
		String data = row.getCell(1).getStringCellValue();
		System.out.println(data);*/
		
		
		//Write to Excelsheet
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(dataSheetName);
		Row row = sheet.getRow(0);//Fetching data from 1st Row
		Cell cell = row.createCell(1);
		cell.setCellType(cell.CELL_TYPE_STRING);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		cell.setCellValue("Pass");
		wb.write(fos);
		

	}

}
