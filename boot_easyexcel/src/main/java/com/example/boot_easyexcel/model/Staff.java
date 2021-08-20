package com.example.boot_easyexcel.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/5/24 11:12
 * @Descrption: change_the_world
 */
@Data
public class Staff extends BaseRowModel {
    @ExcelProperty(value = "编号", index = 0)
    private String id;
    @ExcelProperty(value = "姓名", index = 1)
    private String name;
    @ExcelProperty(value = "性别", index = 2)
    private String sex;
    @ExcelProperty(value = "联系方式", index = 3)
    private String phone;
}
