package com.dell.example.EnumsDemo;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by 20304 on 2017/11/6.
 */
public class EnumSetDemo2 {

    public static void main(String[] args) {
        EnumSet<FontConstant> enumSet = EnumSet.noneOf(FontConstant.class);

        enumSet.add(FontConstant.Bold);
        enumSet.add(FontConstant.Italilc);
        enumSet.add(FontConstant.Hello);
        System.out.println(enumSet);
    }

    public static void showEnumSet(EnumSet<FontConstant> enumSet)
    {
        for (Iterator<FontConstant> iter = enumSet.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
