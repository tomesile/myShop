package com.tms.java.record;

import com.tms.java.utils.ProductList4Scan;

public class Record {
    Record(){}
    public static void toRecord(String sn)
    {
        ProductList4Scan.del(sn);
        System.out.println(ProductList4Scan.getList());
    }
}
