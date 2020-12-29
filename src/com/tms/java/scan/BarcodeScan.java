package com.tms.java.scan;

import com.tms.java.interfaces.IScan;
import com.tms.java.utils.ProductList4Scan;

public class BarcodeScan implements IScan {
    @Override
    public void scan() {
       System.out.println("barcode scan now !");
        ProductList4Scan.add("product0");//add scan result to list
        ProductList4Scan.add("product0");//add scan result to list
        ProductList4Scan.add("product1");//add scan result to list
        ProductList4Scan.add("product0");//add scan result to list
        System.out.println(ProductList4Scan.getList().get(0).toString());
    }

    @Override
    public String getDetail() {
        return null;
    }

}
