package client;

import java.io.IOException;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import tools.ExcelUtils;

public class ExploreTest {
    public static void main(String[] args) throws IOException {
        String sheetName = "sheet����";
        String sheetTitle = "��ͷ";
        List < String > columnNames = new LinkedList < > ();
        columnNames.add("���Ա�ͷ��������Ӧ���Ա�ͷ��������Ӧ���Ա�ͷ��������Ӧ");
        columnNames.add("��Ԫ��2");
        columnNames.add("��Ԫ��3");
        columnNames.add("��Ԫ��4");
        columnNames.add("��Ԫ��5");
        columnNames.add("��Ԫ��6");


        //д�����--�ڶ��ַ�ʽ
        ExcelUtils.writeExcelTitle("D:\\tset", "biaoming1", sheetName, columnNames, sheetTitle, false);


        List < List < Object >> objects = new LinkedList < > ();
        for (int i = 0; i < 5; i++) {
            List < Object > dataA = new LinkedList < > ();
            dataA.add("����");
            dataA.add(new Date(1451036631012L));
            dataA.add(1451036631012L);
            dataA.add("���Ա�ͷ��������Ӧ���Ա�ͷ��������Ӧ���Ա�ͷ��������Ӧ");
            dataA.add(i);
            dataA.add(1.323 + i);
            objects.add(dataA);
        }
        try {
            //д������--�ڶ��ַ�ʽ
        	ExcelUtils.writeExcelData("D:\\tset", "biaoming1", sheetName, objects);
            //ֱ��д������--��һ�ַ�ʽ
        	ExcelUtils.writeExcel("D:\\tset", "biaoming2", sheetName, columnNames, sheetTitle, objects, false);
        	System.out.println("����д��ɹ���");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
