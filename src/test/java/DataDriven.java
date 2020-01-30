import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven 
{
public static void main(String[] args) {
	
	    String s="mmababctamantlslmag";
	    int distinct = 0 ;

	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                distinct++;

	            }
	        }   
	        System.out.println(s.charAt(i)+"--"+distinct);
	        String d=String.valueOf(s.charAt(i)).trim();
	        s=s.replaceAll(d,"");
	        distinct = 0;

	    

	}
}	
}


