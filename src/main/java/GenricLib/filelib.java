package GenricLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class filelib {

	public String readpropertydata(String proppath, String key) throws Throwable 
	{
		FileInputStream fis  = new FileInputStream(proppath);
		Properties prop = new Properties();
		prop.load(fis);
		String propvalue = prop.getProperty(key, "incorrect");
		return propvalue;
	}
	
	public String readexceldata(String path, String sheet, int row, int cell ) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String s = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return s;
	}
	
	public void writeexceldata(String path, String sheet, int row, int cell, Date data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		
		 FileOutputStream fos = new FileOutputStream(path);
		 wb.write(fos);
	}
	
	
	
}
