package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path="C:\\Users\\HP\\Documents\\Practice.xlsx";
		FileInputStream f=new FileInputStream(path);
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=2; j++) {
				String a=WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
					System.out.println(a);
			}
		}

	}

}
