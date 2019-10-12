package client;

import java.io.IOException;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import tools.ExcelUtils;

public class ExploreTest {
    public static void main(String[] args) throws IOException {
        String sheetName = "sheet名字";
        String sheetTitle = "标头";
        List < String > columnNames = new LinkedList < > ();
        columnNames.add("测试标头长度自适应测试标头长度自适应测试标头长度自适应");
        columnNames.add("单元格2");
        columnNames.add("单元格3");
        columnNames.add("单元格4");
        columnNames.add("单元格5");
        columnNames.add("单元格6");


        //写入标题--第二种方式
        ExcelUtils.writeExcelTitle("D:\\tset", "biaoming1", sheetName, columnNames, sheetTitle, false);


        List < List < Object >> objects = new LinkedList < > ();
        for (int i = 0; i < 5; i++) {
            List < Object > dataA = new LinkedList < > ();
            dataA.add("哈哈");
            dataA.add(new Date(1451036631012L));
            dataA.add(1451036631012L);
            dataA.add("测试标头长度自适应测试标头长度自适应测试标头长度自适应");
            dataA.add(i);
            dataA.add(1.323 + i);
            objects.add(dataA);
        }
        try {
            //写入数据--第二种方式
        	ExcelUtils.writeExcelData("D:\\tset", "biaoming1", sheetName, objects);
            //直接写入数据--第一种方式
        	ExcelUtils.writeExcel("D:\\tset", "biaoming2", sheetName, columnNames, sheetTitle, objects, false);
        	System.out.println("数据写入成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
