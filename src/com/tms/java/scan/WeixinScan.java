package com.tms.java.scan;

import com.tms.java.interfaces.IScan;
import com.tms.java.utils.ProductList4Scan;

public class WeixinScan implements IScan {
    @Override
    public void scan() {
        System.out.println("weixin scan now !");
        ProductList4Scan.add("products");
        System.out.println(ProductList4Scan.getList().get(0).toString());
    }

    @Override
    public String getDetail() {
        return null;
    }

}
