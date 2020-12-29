package com.tms.java.outbound;

import com.tms.java.interfaces.IOutBound;
import com.tms.java.record.Record;
import com.tms.java.utils.ProductList4Scan;

import java.util.List;

public class OutBoundWithout implements IOutBound {
    public  String currentProduct=null;

    @Override
    public String getCurrentProduct() {
        return currentProduct;
    }

    @Override
    public int getOutBoundMethod() {
        return 1;
    }

    @Override
    public void outBoundMethod() {

    }
}
