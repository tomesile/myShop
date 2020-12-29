package com.tms.java.scan;

import com.tms.java.interfaces.IScan;

public class BarcodeScan implements IScan {
    @Override
    public void scan() {
       System.out.println("barcode scan now !");
    }

}
