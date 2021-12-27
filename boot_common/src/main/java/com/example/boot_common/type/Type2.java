package com.example.boot_common.type;

public class Type2 {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeString(){
        switch (type){
            case "0":
                return "ZERO";
            case "1":
                return "ONE";
            default:
                return "OTHER";
        }
    }

    public static void main(String[] args) {
        Type2 type2 = new Type2();
        System.out.println(type2.getTypeString());
    }
}
