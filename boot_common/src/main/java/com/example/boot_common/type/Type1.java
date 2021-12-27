package com.example.boot_common.type;

public class Type1{
    public enum TypeEnum{
        ZERO,
        ONE
    }

    private TypeEnum type;

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public String getTypeString(){
        switch (type){
            case ZERO:
                return "ZERO";
            case ONE:
                return "ONE";
            default:
                return "OTHER";
        }
    }

    public static void main(String[] args) {
        Type1 type1 = new Type1();
        System.out.println(type1.getTypeString());
    }
}