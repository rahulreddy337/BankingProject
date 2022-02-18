import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fr = new FileInputStream(new File("C:\\Users\\Jaspreet\\Desktop\\Students.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fr);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext())
		{
			Row row = rowIterator.next();
			{
				Iterator<org.apache.poi.ss.usermodel.Cell> colIterator = row.cellIterator();
				{
					while(colIterator.hasNext())
					{
						org.apache.poi.ss.usermodel.Cell cell = colIterator.next();
						{
							switch(cell.getCellTypeEnum())
							{
							case NUMERIC:
								System.out.print(cell.getNumericCellValue()+"\t");
								break;
							case STRING:
								System.out.print(cell.getStringCellValue()+"\t");
								break;
							case BLANK:
								break;
							default:
								break;
							}
						}
					}
				}
				System.out.println();
			}
		}

	}
}
