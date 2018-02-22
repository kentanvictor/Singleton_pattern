package com.dell.example.EnumsDemo;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by 20304 on 2017/11/6.
 */

enum FontConstant
{
    Plain , Bold , Italilc, Hello
}
public class EnumSetDemo {

    public static void main(String[] args) {
        EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain,FontConstant.Italilc,FontConstant.Bold);
        showEnumSet(enumSet);
        System.out.println("--------------------");
        showEnumSet(EnumSet.complementOf(enumSet));
    }

    public static void showEnumSet(EnumSet<FontConstant> enumSet)
    {
        for (Iterator<FontConstant> iter = enumSet.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
