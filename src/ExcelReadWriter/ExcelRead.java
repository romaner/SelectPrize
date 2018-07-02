package ExcelReadWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import DrawFunction.FunctionRun1;
import DrawFunction.FunctionRun4;

public class ExcelRead {
	public static int excelnum;
	public static int rownum01;
	static String namephone1;
	
	public static Workbook getWeebWork(String filename) throws IOException {
		Workbook workbook;
		workbook = null;
		if (null != filename) {
			String fileType = filename.substring(filename.lastIndexOf("."), filename.length());
			FileInputStream fileStream = new FileInputStream(new File(filename));
			if (".xls".equals(fileType.trim().toLowerCase())) {
				workbook = new HSSFWorkbook(fileStream);// ���� Excel 2003 ����������
			} else if (".xlsx".equals(fileType.trim().toLowerCase())) {
				workbook = new XSSFWorkbook(fileStream);// ���� Excel 2007 ����������
			}
		}
		return workbook;
	}

	public static int ReadExcelNum() throws IOException {

		String filePath = "D:/test01.xls";
		Workbook workbook;
		workbook = getWeebWork(filePath);
		Sheet sheet = workbook.getSheetAt(0);
		// ��ȡ������
		excelnum = sheet.getLastRowNum();
		return excelnum;
	}

	public static String ReadExcelReturnNamePhone() throws IOException {
		/**
		 * ��ȡExcel���е���������
		 */
		String filePath = "D:/test01.xls";
		Workbook workbook;
		workbook = getWeebWork(filePath);
		Sheet sheet = workbook.getSheetAt(0);
		// ��ȡ������
		rownum01 = sheet.getLastRowNum();
		// ��ȡָ��λ�õĵ�Ԫ��
		Row row = sheet.getRow(FunctionRun1.run1());
		Cell cell1 = row.getCell(1);
		Cell cell2 = row.getCell(2);
		// ��Cell����ת��ΪString����
		//String name = new String(cell1.getStringCellValue());
		String name = cell1.getStringCellValue();
		// ����ѧ��������ʾ������ת��ΪString����
		BigDecimal big = new BigDecimal(cell2.getNumericCellValue());
		 String namephone = String.valueOf(name) + "  " + String.valueOf(big);
		return namephone;
	}
	
	
	public static String ReadExcelReturnNamePhone1() throws IOException {
		/**
		 * ��ȡExcel���е���������
		 */
		String filePath = "D:/test01.xls";
		Workbook workbook;
		workbook = getWeebWork(filePath);
		Sheet sheet = workbook.getSheetAt(0);
		// ��ȡ������
		rownum01 = sheet.getLastRowNum();
		// ��ȡָ��λ�õĵ�Ԫ��
		Row row = sheet.getRow(FunctionRun4.run4());
		Cell cell1 = row.getCell(1);
		Cell cell2 = row.getCell(2);
		// ��Cell����ת��ΪString����
		//String name = new String(cell1.getStringCellValue());
		String name = cell1.getStringCellValue();
		// ����ѧ��������ʾ������ת��ΪString����
		BigDecimal big = new BigDecimal(cell2.getNumericCellValue());
		namephone1 = String.valueOf(name) + "  " + String.valueOf(big);
		return namephone1;
	}
}
