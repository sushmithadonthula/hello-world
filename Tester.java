package com.combino.datatypes;

public class Tester
{
    public static void main(String[] args) {
     /*   DataTypes dt= new DataTypes();
        dt.byteType();
        dt.charType();
        dt.intType();
        dt.shortType();
        dt.longType();
        dt.floatType();
        dt.doubleType();
        dt.boolType();*/

        System.out.println("---------------------");

        ExampleDataTypes edt= new ExampleDataTypes();
        System.out.println("Default values of primitive types");
        edt.defaultValues();
        edt.randomValues();
        edt.defaultValues();
        edt.test();
        edt.defaultValues();
    }
}
