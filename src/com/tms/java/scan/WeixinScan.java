package com.tms.java.scan;

import com.tms.java.interfaces.IScan;

public class WeixinScan implements IScan {
    @Override
    public void scan() {
        System.out.println("weixin scan now !");
    }

}
