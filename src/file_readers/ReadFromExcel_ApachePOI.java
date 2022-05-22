package file_readers;

//import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;

public class ReadFromExcel_ApachePOI {
    public static void main(String[] args) throws Exception {

        //System.getProperty("user.dir") fetches the directory or path of the workspace for the current project
        File f = new File(System.getProperty("user.dir") + "\\src\\file_readers\\sampledatasafety.xlsx");
        FileInputStream fileInputStream = new FileInputStream(f);
//        Workbook workBook = WorkbookFactory.create(fileInputStream);
//        Sheet sheetName = workBook.getSheet("SafetyData");
//
//        int totalRows = sheetName.getLastRowNum();
//        System.out.println(totalRows);
//
//        Row rowCells = sheetName.getRow(0);
//        int totalCols = rowCells.getLastCellNum();
//        System.out.println(totalCols);
//
//        DataFormatter format = new DataFormatter();
//        String[][] testData = new String[totalRows][totalCols];
//        for(int i = 1; i <= totalRows; i++) {
//            for(int j = 0; j < totalCols; j++) {
//                testData[i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j));
//                System.out.println(testData[i-1][j]);
//            }
//        }
    }
}
