package com.example.boot_common.type;

public class Type3 {
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
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
        Type3 type3 = new Type3();
        System.out.println(type3.getTypeString());
    }
}
