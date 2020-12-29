package com.tms.java.scan;

import com.tms.java.interfaces.IScan;

public class Scan {
    private IScan weixinScan;
    private IScan barCodeScan;
    private static IScan scan;
    public Scan(){
        this(1);
    }
   public  Scan(int scanId)
    {
        if(scanId==0) {
            weixinScan = new WeixinScan();
            scan=weixinScan;
        }
        else if(scanId==1){
            barCodeScan=new BarcodeScan();
            scan=barCodeScan;
        }


    }
    public static IScan getScan()
    {
        return scan;
    }
    public static void scanNow()
    {
      System.out.println("start to scan !");
        getScan().scan();

    }
}
