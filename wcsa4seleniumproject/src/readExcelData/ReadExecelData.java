package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExecelData {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the excel sheet file
		Workbook wb=WorkbookFactory.create(fis);// make the file for Read
		Sheet sheet=wb.getSheet("IPL");// take sheet name
		row=sheet.getRow(1); // get value of row
		Cell cell=row.getCell(0); //get the value of cell
		String data=cell.getStringCellValue(); //it will give the value present in the cell
		System.out.println(data);
		
	}

}
