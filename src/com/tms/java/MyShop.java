package com.tms.java;

import com.tms.java.inbound.InboundMethodBrand;
import com.tms.java.inbound.InboundMethodPromotion;
import com.tms.java.inbound.InboundMethodRacks;
import com.tms.java.interfaces.IInbound;
import com.tms.java.interfaces.IOutBound;
import com.tms.java.outbound.OutBoundWithIn;
import com.tms.java.outbound.OutBoundWithout;
import com.tms.java.safety.Safety;
import com.tms.java.scan.Scan;
import com.tms.java.statistics.Statistics;

public class MyShop {
    private static IInbound inbound;
    private static IOutBound outbound;
    public static void main(String[] args){
        safety();
        scan();
        System.out.println("This is a shop app !");

        storeOperation(0,0);
        statistics();

    }
    MyShop(){}
    //select a method to outbound
    public static void  selectOutboundMethod(int methodId)
    {
        if(methodId==0) outbound=new OutBoundWithIn();
        else if(methodId==1) outbound=new OutBoundWithout();
        else
        {
            outbound=new OutBoundWithout();
        }
    }
    //select a method to inbound
    public static void selectInboundMethod(int methodId)
    {
       switch (methodId)
       {
           case 0: inbound=new InboundMethodRacks();break;
           case 1: inbound=new InboundMethodBrand();break;
           case 2: inbound=new InboundMethodPromotion();break;
           default:inbound=new InboundMethodRacks();break;
       }
    }
    public static void toInbound() //start to inbound
    {
        System.out.println("start to inbound !");
        inbound.inBoundMethod();
    }
    public static void toOutbound() //start to inbound
    {
        System.out.println("start to outbound !");
        outbound.outBoundMethod();
    }
    //select inbound or outbound and select inblund methodId or outbound method
    public static void storeOperation(int storeMethod,int methodId)
    {
        if(storeMethod==0)
        {
            selectInboundMethod(methodId);
            toInbound();
        }
        else if(storeMethod==1)
        {
            selectOutboundMethod(methodId);
            toOutbound();
        }
    }
    public static void statistics()
    {
        System.out.println("statistics is turn on !");
        Statistics.statistics();
    }
    public static void safety()
    {
        System.out.println("safety is turn on !");
        Safety.safety();
    }
    public static void scan()
    {
        new Scan();
        Scan.scanNow();
    }
}
