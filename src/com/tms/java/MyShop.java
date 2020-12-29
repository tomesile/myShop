package com.tms.java;

import com.tms.java.inbound.InboundMethodBrand;
import com.tms.java.inbound.InboundMethodPromotion;
import com.tms.java.inbound.InboundMethodRacks;
import com.tms.java.interfaces.IInbound;
import com.tms.java.interfaces.IOutBound;
import com.tms.java.outbound.OutBoundWithIn;
import com.tms.java.outbound.OutBoundWithout;
import com.tms.java.safety.Safety;
import com.tms.java.statistics.Statistics;

public class MyShop {
    private IInbound inbound;
    private IOutBound outbound;
    public static void main(String[] args){

        System.out.println("This is a shop app !");

    }
    MyShop(){}
    //select a method to outbound
    public void selectOutboundMethod(int methodId)
    {
        if(methodId==0) outbound=new OutBoundWithIn();
        else if(methodId==1) outbound=new OutBoundWithout();
    }
    //select a method to inbound
    public void selectInboundMethod(int methodId)
    {
       switch (methodId)
       {
           case 0: inbound=new InboundMethodRacks();break;
           case 1: inbound=new InboundMethodBrand();break;
           case 2: inbound=new InboundMethodPromotion();break;
           default:inbound=new InboundMethodRacks();break;
       }
    }
    public void toInbound() //start to inbound
    {
        inbound.inBoundMethod();
    }
    public void toOutbound() //start to inbound
    {
        outbound.outBoundMethod();
    }
    public void storeOperation(int storeMethod)//select inbound or outbound
    {
        if(storeMethod==0) toInbound();
        else if(storeMethod==1) toOutbound();
    }
    public void statistics()
    {
        Statistics.statistics();
    }
    public void safety()
    {
        Safety.safety();
    }

}
