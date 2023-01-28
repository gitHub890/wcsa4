package readExcelData;

import java.io.FileInputStream;

public class ReadMultipleData {
	public static void main(String[] args) {
		

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the excel sheet file
		Workbook wb=WorkbookFactory.create(fis);// make the file for Read
		Sheet sheet=wb.getSheet("IPL");// take sheet name
		Row row=sheet.getRow(1); // get value of row
		Cell cell=row.getCell(0); //get the value of cell
		String data=cell.getStringCellValue(); //it will give the value present in the cell
		System.out.println(data);
		
	}

}
