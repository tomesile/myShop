package com.tms.java.outbound;

import com.tms.java.interfaces.IOutBound;

public class OutBoundWithIn implements IOutBound {
    public  String currentProduct=null;

    @Override
    public String getCurrentProduct() {
        return currentProduct;
    }

    @Override
    public int getOutBoundMethod() {
        return 0;
    }

    @Override
    public void outBoundMethod() {

    }
}
