package com.example.boot_common.type;

public class Type4 {
    public Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeString(){
        switch (type){
            case 0:
                return "ZERO";
            case 1:
                return "ONE";
            default:
                return "OTHER";
        }
    }

    public static void main(String[] args) {
        Type4 type4 = new Type4();
        System.out.println(type4.getTypeString());
    }
}
