package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
	
	@DataProvider(name = "testdata")
	public static String [][] getData() throws IOException
	{
String path = "F:\\Desktop\\VimanNagar\\May 21\\SeleniumBasicsRevision\\data\\TestData.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
//		String datavalue = sh1.getRow(5).getCell(1).getStringCellValue();
		
		DataFormatter df = new DataFormatter();
		
	int	row = sh1.getLastRowNum()+1;
	int column = sh1.getRow(0).getLastCellNum();
	
	String [][] data = new String[row][column];
	
	for(int i=0; i<row; i++)
	{
		for(int j= 0; j<column; j++)
		{
			data[i][j] = df.formatCellValue(sh1.getRow(i).getCell(j));
		}
	}
		
	return data;
		
	}

}
