package com.combino.datatypes;

import java.sql.SQLOutput;

public class ExampleDataTypes {
    private byte aByte;
    private short aShort;
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private char aChar;
    private boolean aBoolean;

    public void defaultValues(){

        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInt);
        System.out.println(aLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aChar);
        System.out.println(aBoolean);

    }

    public void randomValues(){
        aByte=2;
        aShort=3455;
        anInt=232222222;
        aLong=3456545443433332323L;
        aFloat=8.9f;
        aDouble=98.997;
        aChar='/';
        aBoolean=true;
    }

    public void test(){
        System.out.println("Sum "+(aByte+aShort));
        System.out.println(aChar+aDouble+" Sum of char and double");
    }
}
