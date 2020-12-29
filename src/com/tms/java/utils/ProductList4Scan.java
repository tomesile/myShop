package com.tms.java.utils;

import java.util.ArrayList;
import java.util.List;

public class ProductList4Scan {
    private static List<String> list=new ArrayList<String>();
    public static List<String>  getList()
    {
        return list;
    }
    public static boolean add(String item)
    {
        list.add(item);
        return true;
    }

    public static boolean del(String item)
    {
        list.remove(item);
        return true;
    }
    public static boolean del(int index)
    {
        list.remove(index);
        return true;
    }
}
