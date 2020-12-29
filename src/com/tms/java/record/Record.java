package com.tms.java.record;

import com.tms.java.utils.ProductList4Scan;

import java.util.HashMap;
import java.util.Map;

public class Record {
    Record(){}
    public static Map<String,Integer> map=new HashMap<String, Integer>();
    public static void toRecord(String sn)
    {
        System.out.println("sn:"+sn);
        putToMap(sn);
        ProductList4Scan.del(sn);
        System.out.println(ProductList4Scan.getList());
    }
    public static void putToMap(String sn)
    {
        if(sn==null) return;
        if(map.containsKey(sn))
        {
            map.put(sn,map.get(sn)+1);

        }
        else
        {
            map.put(sn,1);
        }
        System.out.println("map:"+map);
    }
}
