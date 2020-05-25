package com.example.boot_easyexcel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.boot_easyexcel.model.Staff;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BootEasyexcelApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 读取excel信息
     */
    @Test
    void readExcel(){

    }

    /**
     * 简单的写文件信息
     */
    @Test
    void writeExcel(){
        try (OutputStream out = new FileOutputStream("withHead.xlsx");) {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            Sheet sheet1 = new Sheet(1, 0);
            //sheet页名称
            sheet1.setSheetName("sheet1");
            //导出主数据
            List<List<String>> data = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                List<String> item = new ArrayList<>();
                item.add("item0" + i);
                item.add("item1" + i);
                item.add("item2" + i);
                data.add(item);
            }
            List<List<String>> head = new ArrayList<List<String>>();
            List<String> headCoulumn1 = new ArrayList<String>();
            List<String> headCoulumn2 = new ArrayList<String>();
            List<String> headCoulumn3 = new ArrayList<String>();
            headCoulumn1.add("莫名其妙第一列");
            headCoulumn2.add("莫名其妙第二列");
            headCoulumn3.add("莫名其妙第三列");
            head.add(headCoulumn1);
            head.add(headCoulumn2);
            head.add(headCoulumn3);
            Table table = new Table(1);
            table.setHead(head);
            writer.write0(data, sheet1, table);
            writer.finish();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 写文件信息，使用注解做表头
     */
    @Test
    void writeExcelHead(){
        try (OutputStream out = new FileOutputStream("withHead.xlsx");) {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            Sheet sheet1 = new Sheet(1, 0, Staff.class);
            sheet1.setSheetName("sheet1");
            List<Staff> data = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                Staff item = new Staff();
                item.setId("id"+i);
                item.setName("name"+i);
                item.setPhone("phone"+i);
                item.setSex("sex"+i);
                data.add(item);
            }
            writer.write(data, sheet1);
            writer.finish();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
