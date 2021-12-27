package com.example.boot_common.jsontest;
import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.Labels;

public class JsonFieldTest {

    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(new TaskV1()));
        System.out.println(JSON.toJSONString(new TaskVO()));
        String a="{\"gmtTime\":\"2019-09-25-17:23:10\",\"height\":\"1234\",\"length\":\"923\"}";
        System.out.println(JSON.parseObject(a, TaskVO.class));
        System.out.println(JSON.toJSONString(a, Labels.includes("normal")));
    }
}

class TaskV1{
    @JSONField(name = "root")
    private TaskVO root = new TaskVO();

    public TaskVO getRoot() {
        return root;
    }

    public void setRoot(TaskVO root) {
        this.root = root;
    }
}


class TaskVO{
    //@JSONField(ordinal = 1)//指定json序列化的顺序
    //@JSONField(serialize = false)//json序列化时忽略该字段
    //@JSONField(deserialize = false)//json反序列化时转成对象将忽略该字段
    //@JSONField(format = "yyyy-MM-dd-HH:mm:ss")//json格式转换
    //@JSONField(name = "gmtTime",format = "yyyy-MM-dd-HH:mm:ss")//指定反序列化的字符串名称
    @JSONField(ordinal = 1)
    private Date time=new Date();
    @JSONField(name="height",ordinal = 3)
    private String height="2019";
    @JSONField(name="length",ordinal = 2)
    private String length="923";
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getLength() {
        return length;
    }
    public void setLength(String length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return "TaskVO [time=" + time + ", height=" + height + ", length=" + length + "]";
    }
}